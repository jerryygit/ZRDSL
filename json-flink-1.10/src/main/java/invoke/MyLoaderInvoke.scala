package invoke

import java.util

import org.apache.flink.api.common.typeinfo.{BasicTypeInfo, TypeInformation, Types}
import org.apache.flink.api.java.ExecutionEnvironment
import org.apache.flink.api.java.io.jdbc.JDBCAppendTableSink
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
import org.apache.flink.table.api.java.{BatchTableEnvironment, StreamTableEnvironment}
import org.apache.flink.table.api.{DataTypes, GroupedTable, Table, TableEnvironment}
import org.apache.flink.table.descriptors.{Json, Kafka, Schema}
import parse.{MingBdJSONBaseListener, MingBdJSONParser}
import dsource.MysqlSQLSource
import tool.{JSONTool, UDFRegister}

import scala.collection.JavaConverters._

class MyLoaderInvoke extends MingBdJSONBaseListener {


  var tableEnv: TableEnvironment = _
  var streamEnv: StreamExecutionEnvironment = _
  var batchEnv: ExecutionEnvironment = _
  var rMode: String = _
  //  private[dsl] val values: ParseTreeProperty[Table] = new ParseTreeProperty[Table]
  //  private[dsl] val mapSchema: util.Map[String, String] = new util.HashMap[String, String]
  private[invoke] val map: util.Map[String, Table] = new util.HashMap[String, Table]


  override def exitJson(ctx: MingBdJSONParser.JsonContext): Unit = {
    if (rMode == "stream")
      streamEnv.execute()
    else
      batchEnv.execute()
  }

  override def enterRuntype(ctx: MingBdJSONParser.RuntypeContext): Unit = {
    val mode: String = ctx.getChild(2).getText.replaceAll("\"", "")
    mode match {
      case "stream" => {
        println("===================stream mode=====================")
        import org.apache.flink.table.api.EnvironmentSettings
        streamEnv = StreamExecutionEnvironment.getExecutionEnvironment
        val bsSettings = EnvironmentSettings.newInstance.useBlinkPlanner.inStreamingMode.build
        tableEnv = StreamTableEnvironment.create(streamEnv, bsSettings)
      }
      case "batch" => {
        println("===================batch mode=====================")
        //    val bbSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inBatchMode().build()
        //    tableEnv = TableEnvironment.create(bbSettings)
        batchEnv = ExecutionEnvironment.getExecutionEnvironment
        tableEnv = BatchTableEnvironment.create(batchEnv)
      }
      case _ => throw new RuntimeException(s"$mode not support")
    }
    rMode = mode
  }

  override def enterKafkaSource(ctx: MingBdJSONParser.KafkaSourceContext): Unit = {
    val kafkaSource = ctx.getText
    val json = JSONTool.parseObj(kafkaSource)
    val tname = json.getString("tableName")
    val array = json.getJSONArray("schema").toJavaList(classOf[String]).asScala
    val schema = new Schema()
    val aliasNames = new util.ArrayList[String]()
    for (value <- array) {
      val field = JSONTool.parseObj(value.toString)
      schema.field(field.getString("nameI"), DataTypes.STRING())
      aliasNames.add(field.getString("aliasI"))
    }
    tableEnv.connect(
      new Kafka()
        .version("universal")
        .topic(json.getString("topic"))
        .startFromEarliest()
        .property("zookeeper.connect", json.getString("zk"))
        .property("bootstrap.servers", json.getString("btServers"))
    )
      .withFormat(
        new Json()
          .failOnMissingField(false)
      )
      .withSchema(
        schema
      ).createTemporaryTable(json.getString("topic"))
    val m1 = tableEnv.from(json.getString("topic")).as(String.join(",", aliasNames))
    map.put(tname, m1)
  }


  override def exitKafkaSource(ctx: MingBdJSONParser.KafkaSourceContext): Unit = {
  }

  override def enterHbaseSource(ctx: MingBdJSONParser.HbaseSourceContext): Unit = {

  }

  override def exitHbaseSource(ctx: MingBdJSONParser.HbaseSourceContext): Unit = {
  }

  override def enterMysqlSource(ctx: MingBdJSONParser.MysqlSourceContext): Unit = {
    val obj = JSONTool.parseObj(ctx.getText)
    val info = obj.getJSONObject("info")
    val schema = obj.getJSONArray("schema").toJavaList(classOf[String])
    val strings = new Array[String](schema.size)
    val tableName = obj.getString("tableName")
    val url = info.getString("url")
    val user = info.getString("user")
    val pass = info.getString("pass")
    val query = info.getString("query")
    val source = MysqlSQLSource.getMysqlSource(batchEnv, url, user, pass, query, schema.toArray(strings))
    val fields = String.join(",", schema)
    tableEnv.asInstanceOf[BatchTableEnvironment].createTemporaryView(tableName, source, fields)
    val table = tableEnv.from(tableName)
    map.put(tableName, table)
  }

  override def exitMysqlSource(ctx: MingBdJSONParser.MysqlSourceContext): Unit = {
  }

  override def enterCol(ctx: MingBdJSONParser.ColContext): Unit = {
    val colDesc = ctx.getText
    if (colDesc.contains("(")) {
      val fname = colDesc
        .split("\\(")(0)
        .trim
        .replaceAll("\"", "")
      UDFRegister.register(tableEnv, fname)
    }
  }

  override def exitCol(ctx: MingBdJSONParser.ColContext): Unit = {
  }

  override def enterSelect(ctx: MingBdJSONParser.SelectContext): Unit = {
  }

  override def exitSelect(ctx: MingBdJSONParser.SelectContext): Unit = {
    println(ctx.getText)
    val obj = JSONTool.parseObj(ctx.getText)
    var gp : GroupedTable= null
    if(obj.containsKey("group")){
       val table = map.get(obj.getString("from"))
       gp = table.groupBy(String.join(",",obj.getJSONArray("group").toJavaList(classOf[String])))
    }
    val cols = JSONTool.parseArray(obj.getString("cols")).toJavaList(classOf[String])
    val from = obj.getString("from")
    val to = obj.getString("to")
    val distinct = obj.getBoolean("distinct")
    var table2:Table = null
    if(gp == null){
      val table1 = map.get(from)
      table2= table1.select(String.join(",", cols))
    }else{
      table2= gp.select(String.join(",", cols))
    }
    if (distinct) table2 = table2.distinct()
    if(obj.containsKey("condition")){
      table2 = table2.filter(obj.getString("condition"))
    }
    table2.printSchema()
    map.put(to, table2)
  }

  override def enterMysqlSave(ctx: MingBdJSONParser.MysqlSaveContext): Unit = {
    val obj = JSONTool.parseObj(ctx.getText)
    val info = obj.getJSONObject("info")
    val schema = obj.getJSONArray("schema").toJavaList(classOf[String])
    val from = obj.getString("from")
    val to = obj.getString("to")
    val url = info.getString("url")
    val user = info.getString("user")
    val pass = info.getString("pass")
    val query = info.getString("query")
    val sink: JDBCAppendTableSink = JDBCAppendTableSink.builder()
      .setDrivername("com.mysql.cj.jdbc.Driver")
      .setDBUrl(url)
      .setUsername(user)
      .setPassword(pass)
      .setQuery(query)
      .setParameterTypes(
        BasicTypeInfo.STRING_TYPE_INFO,
        BasicTypeInfo.INT_TYPE_INFO)
      .build()
    tableEnv.registerTableSink(
      to, Array[String]("sjhm","freqs"),
      Array[TypeInformation[_]](Types.STRING,Types.INT),
      sink)
    map.get(from).insertInto(to)
  }

  override def exitMysqlSave(ctx: MingBdJSONParser.MysqlSaveContext): Unit = {

  }
  override def enterGroupBy(ctx: MingBdJSONParser.GroupByContext): Unit = {

  }

  override def exitGroupBy(ctx: MingBdJSONParser.GroupByContext): Unit = {

  }

  override def enterFilter(ctx: MingBdJSONParser.FilterContext): Unit = {
    //    val filter = ctx.getText
    //    val obj = JSONTool.parseObj(filter)
    //    val condition = obj.getString("condition")
    //    val from = obj.getString("from")
    //    val to = obj.getString("to")
    //    val table1 = map.get(from)
    //    val table2 = table1.filter(condition)
    //    map.put(to, table2)
  }

  override def exitFilter(ctx: MingBdJSONParser.FilterContext): Unit = {
  }

  override def enterJoinpair(ctx: MingBdJSONParser.JoinpairContext): Unit = {
    val joinInfo = ctx.getText
    val obj = JSONTool.parseObj(joinInfo)
    val array = obj.getJSONArray("inputT")
    val condition = obj.getJSONArray("conditionT").get(0).toString
    val tout = obj.getString("outputT")
    val t1 = map.get(array.get(0).toString)
    val t2 = map.get(array.get(1).toString)
    val tf = t1.join(t2).where(condition)
    map.put(tout, tf)
  }

  override def exitJoinpair(ctx: MingBdJSONParser.JoinpairContext): Unit = {
  }

  override def enterKafkaSave(ctx: MingBdJSONParser.KafkaSaveContext): Unit = {
    val str = ctx.getText
    val obj = JSONTool.parseObj(str)
    val fTable = obj.getString("from")
    val cols = JSONTool.parseArray(obj.getString("cols")).toJavaList(classOf[String]).asScala
    val types = obj.getJSONArray("types").toJavaList(classOf[String]).asScala
    val zips = cols.zip(types)
    val schema = new Schema()
    for (field <- zips) {
      schema.field(field._1, field._2 match {
        case "string" => DataTypes.STRING()
        case "int" => DataTypes.INT()
        case _ => throw new RuntimeException(s"${field._2} 类型不支持")
      })
    }
    tableEnv.connect(
      new Kafka()
        .version("universal")
        .topic(obj.getString("topic"))
        .property("zookeeper.connect", obj.getString("zk"))
        .property("bootstrap.servers", obj.getString("btServers"))
    )
      .withFormat(
        new Json()
          .failOnMissingField(false).deriveSchema()
      ).withSchema(
      schema
    )
      .createTemporaryTable(obj.getString("topic"))
    map.get(fTable).printSchema()
    map.get(fTable).insertInto(obj.getString("topic"))
  }

  override def exitKafkaSave(ctx: MingBdJSONParser.KafkaSaveContext): Unit = {
  }

  //  def setValue(node: ParseTree, value: Table): Unit = {
  //    values.put(node, value)
  //  }
  //
  //  def getValue(node: ParseTree): Any = values.get(node)

}

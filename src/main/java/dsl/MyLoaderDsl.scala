package dsl

import java.util

import org.apache.flink.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.table.api.scala._
import org.apache.flink.table.api.{DataTypes, EnvironmentSettings, Table}
import org.apache.flink.table.descriptors.{Json, Kafka, Schema}
import org.apache.flink.types._
import parse.{MingBdJSONBaseListener, MingBdJSONParser}
import tools.{FuncRW, JSONTool}

import scala.collection.JavaConverters._

class MyLoaderDsl extends MingBdJSONBaseListener {


  private[dsl] val bsEnv = StreamExecutionEnvironment.getExecutionEnvironment
  private[dsl] var bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build()
  private[dsl] val bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings)

  //  private[dsl] val values: ParseTreeProperty[Table] = new ParseTreeProperty[Table]
  private[dsl] val map: util.Map[String, Table] = new util.HashMap[String, Table]
  //  private[dsl] val mapSchema: util.Map[String, String] = new util.HashMap[String, String]

  override def exitJson(ctx: MingBdJSONParser.JsonContext): Unit = {
    try bsEnv.execute
    catch {
      case e: Exception =>
        e.printStackTrace()
    }
  }

  override def enterRuntype(ctx: MingBdJSONParser.RuntypeContext): Unit = {
    FuncRW.register(bsTableEnv)
    val mode: String = ctx.getChild(2).getText.replaceAll("\"", "")
    mode match {
      case "stream" =>

      case "batch" =>

      case _ =>
        println(mode + "not support")
    }
  }

  override def exitRuntype(ctx: MingBdJSONParser.RuntypeContext): Unit = {
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
    bsTableEnv.connect(
      new Kafka()
        .version("0.10")
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
    val m1 = bsTableEnv.from(json.getString("topic")).as(String.join(",", aliasNames))
    map.put(tname, m1)
  }


  override def exitKafkaSource(ctx: MingBdJSONParser.KafkaSourceContext): Unit = {
  }

  override def enterSelect(ctx: MingBdJSONParser.SelectContext): Unit = {
    println(ctx.getText)
    val obj = JSONTool.parseObj(ctx.getText)
    val cols = JSONTool.parseArray(obj.getString("cols")).toJavaList(classOf[String])
    val from = obj.getString("from")
    val to = obj.getString("to")
    val distinct = obj.getBoolean("distinct")
    val table1 = map.get(from)
    var table2 = table1.select(String.join(",", cols))
    if(distinct) table2 = table2.distinct()
    map.put(to, table2)
  }

  override def exitSelect(ctx: MingBdJSONParser.SelectContext): Unit = {
  }

  override def enterFilter(ctx: MingBdJSONParser.FilterContext): Unit = {
    val filter = ctx.getText
    val obj = JSONTool.parseObj(filter)
    val condition = obj.getString("condition")
    val from = obj.getString("from")
    val to = obj.getString("to")
    val table1 = map.get(from)
    val table2 = table1.filter(condition)
    map.put(to, table2)
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
    val schema = new Schema()
    for (field <- cols) {
      schema.field(field, DataTypes.STRING())
    }
    bsTableEnv.connect(
      new Kafka()
        .version("0.10")
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
    map.get(fTable).toAppendStream[Row].print()
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

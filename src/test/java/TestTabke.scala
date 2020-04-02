import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.table.api.scala.StreamTableEnvironment
import org.apache.flink.table.api.{DataTypes, EnvironmentSettings}
import org.apache.flink.table.descriptors.{Json, Kafka, Schema}
import org.apache.flink.table.functions._

object TestTabke {

  def main(args: Array[String]): Unit = {
    val bsEnv = StreamExecutionEnvironment.getExecutionEnvironment
    val bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build()
    val bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings)
    bsTableEnv.connect(
      new Kafka()
        .version("0.10")
        .topic("t1")
        .startFromEarliest()
        .property("zookeeper.connect", "localhost:2181")
        .property("bootstrap.servers", "localhost:9092")
    )
      .withFormat(
        new Json()
          .failOnMissingField(false)
      )
      .withSchema(
        new Schema()
          .field("id", DataTypes.INT())
          .field("name", DataTypes.STRING())
      ).createTemporaryTable("t1")

    bsTableEnv.connect(
      new Kafka()
        .version("0.10")
        .topic("t2")
        .startFromEarliest()
        .property("zookeeper.connect", "localhost:2181")
        .property("bootstrap.servers", "localhost:9092")
    )

      // declare a format for this system
      .withFormat(
        new Json()
          .failOnMissingField(false)
      )
      .withSchema(
        new Schema()
          .field("id", DataTypes.INT())
          .field("age", DataTypes.STRING())
      ).createTemporaryTable("t2")

    val m1 = bsTableEnv.from("t1").as("id1,name")
    val m2 = bsTableEnv.from("t2").as("id2,age")
    val mf = m1.join(m2).where("id1 = id2")
    //    val code = FuncDefine.getFuns().getOrElse("tailMap", null)
    //    val cim = ClassCreateUtils(code)
    //    val ins = cim.instance
    //    val tail = new TailMap("_tail")
    //    println(ins.getClass)
    //    println(tail.getClass)
    //    bsTableEnv.registerFunction("tailmap", ins)
    //    mf.select('name, ins('name))
    bsEnv.execute()

  }

  class TailMap(tail: String) extends ScalarFunction {
    def eval(a: String) = {
      a + tail
    }
  }

}

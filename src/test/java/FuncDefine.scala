import scala.collection.mutable

object FuncDefine {
   def getFuns()={
     val map = new mutable.HashMap[String,String]()
     map.+=(("tailMap",
       """
         | import org.apache.flink.table.functions._
         | class TailMap extends ScalarFunction {
         |    def eval(a: String) = {
         |      a + "_tail"
         |    }
         |  }
         |
         |""".stripMargin))
     map.+=(("fmap",
       """
         |class MyFlatMapFunction extends TableFunction[Row] {
         |  def eval(str: String): Unit = {
         |    if (str.contains("#")) {
         |      str.split("#").foreach({ s =>
         |        val row = new Row(2)
         |        row.setField(0, s)
         |        row.setField(1, s.length)
         |        collect(row)
         |      })
         |    }
         |  }
         |
         |  override def getResultType: TypeInformation[Row] = {
         |    Types.ROW(Types.STRING, Types.INT)
         |  }
         |}
         |""".stripMargin))

     map
   }
}

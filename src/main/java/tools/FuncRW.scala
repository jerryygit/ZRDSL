package tools

import entity.UDFDefine
import javassist.{ClassPool, CtNewMethod}
import org.apache.flink.table.api.scala.StreamTableEnvironment
import org.apache.flink.table.functions.ScalarFunction

import scala.collection.mutable

object FuncRW {
  val pool = ClassPool.getDefault
  var map = new mutable.HashMap[String, UDFDefine]()
  val f1 = new UDFDefine
  f1.setClassName("TailMapFun")
  f1.setCode(
    """
      |  public String eval(String name){
      |     return name+"_tail";
      |  }
      |""".stripMargin)
  f1.setType("udf")

  val f2 = new UDFDefine
  f2.setClassName("HeadMapFun")
  f2.setCode(
    """
      |  public String eval(String name){
      |     return "head_"+name;
      |  }
      |""".stripMargin)
  f2.setType("udf")
  map.+=(("tailMap", f1))
  map.+=(("headMap", f2))

  def getFunByName(name: String) = {
    map.get(name).getOrElse(null)
  }

  def register(bsTableEnv: StreamTableEnvironment) = {
    map.foreach(item => {
      val name = item._1
      val define = item._2
      val cc = pool.makeClass(define.getClassName, pool.get("org.apache.flink.table.functions.ScalarFunction"))
      val m = CtNewMethod.make(define.getCode, cc)
      cc.addMethod(m)
      val func = cc.toClass.newInstance.asInstanceOf[ScalarFunction]
      bsTableEnv.registerFunction(name, func)
    })
  }
}

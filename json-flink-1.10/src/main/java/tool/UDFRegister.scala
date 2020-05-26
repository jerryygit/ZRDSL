package tool

import java.nio.charset.Charset

import javassist.{ClassPool, CtNewMethod}
import org.apache.flink.shaded.guava18.com.google.common.hash.{BloomFilter, Funnels}
import org.apache.flink.table.api.TableEnvironment
import org.apache.flink.table.functions.ScalarFunction

object UDFRegister {
  val pool = ClassPool.getDefault
  val dynamicUdfs = UDFLoadTool.getDynamicUdf()
  val innerUdfs = UDFLoadTool.getInnerUdf()
  val bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("UTF-8")), 1000)

  /**
   * 加载顺序:内置函数->动态函数
   */
  def register(bsTableEnv: TableEnvironment, name: String) = {
    if (!isAlreadyRegister(name)) {
      registerInnerUdf(bsTableEnv, name)
      if (!isAlreadyRegister(name))
        registerDynamicUdf(bsTableEnv, name)
    }
  }

  def isAlreadyRegister(name: String) = {
    bloomFilter.mightContain(name)
  }

  private def registerDynamicUdf(bsTableEnv: TableEnvironment, name: String) = {
    val item = dynamicUdfs.get(name).getOrElse(null)
    if (item != null && item.getType == "udf") {
      val define = item
      val cc = pool.makeClass(define.getClassName, pool.get("org.apache.flink.table.functions.ScalarFunction"))
      val m = CtNewMethod.make(define.getCode, cc)
      cc.addMethod(m)
      val func = cc.toClass.newInstance.asInstanceOf[ScalarFunction]
      bsTableEnv.registerFunction(name, func)
      bloomFilter.put(name)
    }
  }

  private def registerInnerUdf(bsTableEnv: TableEnvironment, name: String) = {
    val clazz = innerUdfs.get(name).getOrElse(null)
    if (clazz != null) {
      bsTableEnv.registerFunction(name, clazz)
      bloomFilter.put(name)
    }
  }

}

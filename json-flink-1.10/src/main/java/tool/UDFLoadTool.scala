package tool

import java.io.File
import java.net.URLDecoder

import anno.UDFRegisterAnno
import entity.UDFDefine
import org.apache.flink.table.functions.ScalarFunction

import scala.collection.mutable

object UDFLoadTool {

  def getDynamicUdf() = {
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
    map
  }


  def getInnerUdf() = {
    val map = new mutable.HashMap[String, ScalarFunction]()
    val packageName = "udfs.udf."
    val packageDirName: String = packageName.replace('.', '/')
    val dirs = UDFLoadTool.getClass.getClassLoader.getResources(packageDirName)
    while (dirs.hasMoreElements) {
      val url = dirs.nextElement
      val protocol = url.getProtocol
      if ("file" == protocol) {
        val filePath = URLDecoder.decode(url.getFile(), "UTF-8")
        val dir = new File(filePath)
        dir.listFiles().foreach(file => {
          val className = file.getName.substring(0, file.getName.length - 6)
          val classFullName = packageName + className
          println(classFullName)
          val clazz = Class.forName(classFullName)
          if (clazz.isAnnotationPresent(classOf[UDFRegisterAnno])) {
            val infoAnno = clazz.getAnnotation(classOf[UDFRegisterAnno])
            if (infoAnno.`type`() == "udf")
              map.put(infoAnno.value(), clazz.newInstance().asInstanceOf[ScalarFunction])
          }
        })
      }
    }
    map
  }


}

object EvalTest {
  def main(args: Array[String]): Unit = {
    import scala.reflect.runtime.universe._
    import scala.tools.reflect.ToolBox

    val code = """(x: String) => x.replace("$", "")"""
    val toolbox = runtimeMirror(EvalTest.getClass.getClassLoader).mkToolBox()
    val func = toolbox.eval(toolbox.parse(code)).asInstanceOf[String => String]
    println(func("$10.50")) // prints "10.50"

    val n = 10
    val code2 = s"println($n)"
    toolbox.eval(toolbox.parse(code2))

    val list = "List(1,2,3)"
    val ll = toolbox.eval(toolbox.parse(list)).asInstanceOf[List[Int]]
    println(ll)

//    val mm = "new com.jason.MM()" //一定要写package.classname 否则会报错not found: type MM
//    val mc = toolbox.eval(toolbox.parse(mm)).asInstanceOf[MM]
//    println(mc.x)
  }
}

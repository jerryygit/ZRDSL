object TestFunc {
  def main(args: Array[String]): Unit = {
    val str =
      """
        |class MyTest {
        |  def toUps(str:String):String = str.toUpperCase
        |  def stripQuotes(s: String): String = {
        |    if (null == s || s.charAt(0) != '"') return s
        |    s.substring(1, s.length - 1)
        |  }
        |}
        |""".stripMargin
    val cim = ClassCreateUtils(str)
    val value = cim.methods("stripQuotes").invoke(cim.instance, "hello")
    val two = cim.methods("toUps").invoke(cim.instance, "fuck")
    println(value)
    println(two)
  }
}

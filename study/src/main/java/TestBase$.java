object TestBase extends App {
  val s =
    """
      |"class TailCode(tail: String) extends ScalarFunction {def eval(s: String): String = {s+tail}}"
      |""".stripMargin

}

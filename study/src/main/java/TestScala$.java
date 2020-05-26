object TestScala extends App {
  val testJava = new TestJava
  val schemas = Array("h1","h2")
  testJava.setSchema(schemas)
  testJava.setSchema(testJava.getSchema.toList.:+("nerResult").toArray)
  testJava.getSchema.foreach(println(_))
}

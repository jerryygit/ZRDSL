object TestTabke {

  def main(args: Array[String]): Unit = {
    val bsEnv = StreamExecutionEnvironment.getExecutionEnvironment
    val bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build()
    val bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings)
    //设置checkpoint
    //    bsEnv.enableCheckpointing(5 * 1000, CheckpointingMode.EXACTLY_ONCE)
    //    bsEnv.setStateBackend(new RocksDBStateBackend("file:///D:\\checkpoint"))

    bsTableEnv.connect(
      new Kafka()
        .version("0.10")
        .topic("t1")
//        .startFromEarliest()
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
    val pool = ClassPool.getDefault
    val cc = pool.makeClass("TailMapFun", pool.get("org.apache.flink.table.functions.ScalarFunction"))
    val m = CtNewMethod.make(
      """
        |public String eval(String name){return $1+"_tail";}
        |""".stripMargin, cc)
    cc.addMethod(m)
    val func = cc.toClass.newInstance.asInstanceOf[ScalarFunction]
    bsTableEnv.registerFunction("tailmap", func)
    mf.select('name, func('name)).toAppendStream[Row].print()
    bsEnv.execute()

  }
}

## 目标
Flink,Spark技术能解决大数据实时和离线处理问题，但是这些大数据技术学习有一定的门槛，那么其他非大数据专业人员如何去解决自己的业务问题呢？针对这个问题，本项目提供了一种简单的描述语法，通过描述任务过程，自动编译为大数据处理任务。

## 语法示例
`{
  "runMode": "stream",
  "load": [
    {
      "zk": "127.0.0.1:2181",
      "btServers": "127.0.0.1:9092",
      "topic": "t1",
      "groupId": "test1",
      "schema": [
        {
          "nameI": "id",
          "aliasI": "id1"
        },
        {
          "nameI": "name",
          "aliasI": "name"
        }
      ],
      "tableName": "t1"
    },
    {
      "zk": "127.0.0.1:2181",
      "btServers": "127.0.0.1:9092",
      "topic": "t2",
      "groupId": "test2",
      "schema": [
        {
          "nameI": "id",
          "aliasI": "id2"
        },
        {
          "nameI": "age",
          "aliasI": "age"
        }
      ],
      "tableName": "t2"
    }
  ],
  "join": [
    {
      "inputT": [
        "t1",
        "t2"
      ],
      "conditionT": [
        "id1=id2"
      ],
      "outputT": "tout"
    }
  ],
  "transform": [
    {
      "cols": [
        "id1",
        "tailMap(name)",
        "headMap(name)",
        "age"
      ],
      "from": "tout",
      "to": "outTable",
      "distinct": false
    },
    {
      "condition": "age===\"18\"",
      "from": "outTable",
      "to": "outTableF"
    }
  ],
  "save": [
    {
      "zk": "127.0.0.1:2181",
      "btServers": "127.0.0.1:9092",
      "topic": "t4",
      "from": "outTableF",
      "cols": [
        "id1",
        "_c1",
        "_c2",
        "age"
      ]
    }
  ]
}`
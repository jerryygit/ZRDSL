import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.formats.json.JsonRowDeserializationSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;

import java.util.Properties;

public class CommonApp {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("zookeeper.connect", "localhost:2181");
        properties.setProperty("group.id", "test1");

        DataStream<String> stream1 = env
                .addSource(new FlinkKafkaConsumer010<>("t1", new SimpleStringSchema(), properties).setStartFromEarliest());
        stream1.print();

        DataStream<String> stream2 = env
                .addSource(new FlinkKafkaConsumer010<>("t2", new SimpleStringSchema(), properties).setStartFromEarliest());
        stream2.print();
        env.execute();
    }
}

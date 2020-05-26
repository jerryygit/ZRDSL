import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.io.jdbc.JDBCInputFormat;
import org.apache.flink.api.java.typeutils.RowTypeInfo;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.types.Row;

/**
 * FileName:    TestBatch
 * Author:      JERRY
 * Date:        2020/5/14 11:05
 * Description:
 */
public class TestBatch {
    public static void main(String[] args) throws Exception {

        TypeInformation[] fieldTypes = new TypeInformation[]{BasicTypeInfo.STRING_TYPE_INFO};
        //2.定义field name
        String[] fieldNames = new String[]{"riqi"};
        //3.定义Row类型
        RowTypeInfo rowTypeInfo = new RowTypeInfo(fieldTypes, fieldNames);

        JDBCInputFormat jdbcInputFormat = JDBCInputFormat.buildJDBCInputFormat()
                .setDrivername("com.mysql.cj.jdbc.Driver")
                .setDBUrl("jdbc:mysql://172.17.1.165/gadsj_demo")
                .setUsername("root")
                .setPassword("123456")
                .setQuery("select riqi from serv_czrsjhdxx")
                .setRowTypeInfo(rowTypeInfo)
                .finish();

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<Row> source = env.createInput(jdbcInputFormat);
        source.print();
        env.execute();
    }
}

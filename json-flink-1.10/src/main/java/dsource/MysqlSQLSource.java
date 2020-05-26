package dsource;

import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.jdbc.JDBCInputFormat;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.typeutils.RowTypeInfo;
import org.apache.flink.types.Row;

/**
 * FileName:    MysqlSQLSource
 * Author:      JERRY
 * Date:        2020/5/14 10:48
 * Description:
 */
public class MysqlSQLSource {

   public static DataSource<Row> getMysqlSource(ExecutionEnvironment env, String url, String user, String pass,
                                                String query, String[] fields){

       TypeInformation[] fieldTypes = new TypeInformation[fields.length];
       for(int i=0;i<fields.length;i++){
           fieldTypes[i] = BasicTypeInfo.STRING_TYPE_INFO;
       }
       RowTypeInfo rowTypeInfo = new RowTypeInfo(fieldTypes, fields);

       JDBCInputFormat jdbcInputFormat = JDBCInputFormat.buildJDBCInputFormat()
               .setDrivername("com.mysql.cj.jdbc.Driver")
               .setDBUrl(url)
               .setUsername(user)
               .setPassword(pass)
               .setQuery(query)
               .setRowTypeInfo(rowTypeInfo)
               .finish();

       DataSource<Row> source = env.createInput(jdbcInputFormat);
       return source;
   }
}

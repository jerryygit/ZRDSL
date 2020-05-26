package udfs.udf;

import anno.UDFRegisterAnno;
import org.apache.flink.table.functions.ScalarFunction;

/**
 * FileName:    HashCode
 * Author:      JERRY
 * Date:        2020/5/13 11:33
 * Description: hashCode
 */
@UDFRegisterAnno(value = "hashCode",type = "udf")
public class HashCode extends ScalarFunction {
    public String eval(String s) {
        return String.valueOf(s.hashCode());
    }
}

package udfs.udf;

import anno.UDFRegisterAnno;
import org.apache.flink.table.functions.ScalarFunction;
import tool.FormatDate;

/**
 * FileName:    ExtractDate
 * Author:      JERRY
 * Date:        2020/5/13 20:25
 * Description:
 */

@UDFRegisterAnno(value = "extractDate", type = "udf")
public class ExtractDate extends ScalarFunction {
    public String eval(String time) {
        return FormatDate.formatterYmd(time);
    }
}

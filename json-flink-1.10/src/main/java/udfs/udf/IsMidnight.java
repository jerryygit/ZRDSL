package udfs.udf;

import anno.UDFRegisterAnno;
import org.apache.flink.table.functions.ScalarFunction;
import tool.CallBehavior;

@UDFRegisterAnno(value = "isNight", type = "udf")
public class IsMidnight extends ScalarFunction {
    public Boolean eval(String time) {
        return CallBehavior.isMidnight(time);
    }
}

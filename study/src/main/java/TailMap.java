import org.apache.flink.table.functions.ScalarFunction;


public class TailMap extends ScalarFunction {
    public String eval(String var1) {
        return var1 + "_tail";
    }

    public TailMap() {
    }
}


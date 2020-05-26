package udfs.udft;

import anno.UDFRegisterAnno;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.table.functions.TableFunction;

/**
 * FileName:    Split
 * Author:      JERRY
 * Date:        2020/5/13 19:46
 * Description:
 */

@UDFRegisterAnno(value = "split",type = "udft")
public class Split extends TableFunction<Tuple2<String, Integer>> {
    private String separator = " ";

    public Split(String separator) {
        this.separator = separator;
    }

    public void eval(String str) {
        for (String s : str.split(separator)) {
            collect(new Tuple2<String, Integer>(s, s.length()));
        }
    }
}

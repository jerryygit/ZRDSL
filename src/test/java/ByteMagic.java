import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

public class ByteMagic {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.makeClass("TailMapFun", pool.get("org.apache.flink.table.functions.ScalarFunction"));
        CtMethod m = CtNewMethod.make("public String eval(String name){return name+\"_tail\";}", cc);
        cc.addMethod(m);
        cc.toClass().newInstance();
        cc.writeFile();
    }
}

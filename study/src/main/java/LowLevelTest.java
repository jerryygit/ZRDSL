import javassist.bytecode.*;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class LowLevelTest {
    public static void main(String[] args) throws Exception {
        BufferedInputStream fin
                = new BufferedInputStream(new FileInputStream("target\\test-classes\\Study.class"));
        ClassFile cf = new ClassFile(new DataInputStream(fin));
        MethodInfo methodInfo = cf.getMethod("say");
        CodeAttribute attr = methodInfo.getCodeAttribute();
        CodeIterator ci = attr.iterator();
        while (ci.hasNext()) {
            int index = ci.next();
            int op = ci.byteAt(index);
            System.out.println(Mnemonic.OPCODE[op]);
        }
    }
}

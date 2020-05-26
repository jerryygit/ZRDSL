/**
 * FileName:    IntegerError
 * Author:      JERRY
 * Date:        2020/5/26 16:38
 * Description:
 */
public class IntegerError {
    public static void main(String[] args) {
        //Integer里面有个IntegerCache,会在类加载的时候缓存-128->127的数字
        //Integer a=100，会先查找缓存，找到的话直接返回。所以a==b为true。
        //c和d不在缓存中，各自new了新的对象，所以c!=d
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);
        //下面这个特殊符号编译时会转为换行，所以最终还是会打印hello world
        // \u000d System.out.println("Hello World!");
    }
}

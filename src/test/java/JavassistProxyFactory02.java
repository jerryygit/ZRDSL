import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.Method;

public class JavassistProxyFactory02 {
    public Object getProxy(Class clazz) throws InstantiationException, IllegalAccessException {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(clazz);
        proxyFactory.setHandler(new MethodHandler() {
            public Object invoke(Object self, Method thismethod, Method proceed, Object[] args) throws Throwable {
                System.out.println("--------------------------------");
                System.out.println(self.getClass());
                System.out.println("代理类对方法的代理引用:" + thismethod.getName());
                System.out.println("开启事务 -------");
                Object result = proceed.invoke(self, args);
                System.out.println("提交事务 -------");
                return result;
            }
        });
        return proxyFactory.createClass().newInstance();
    }
}

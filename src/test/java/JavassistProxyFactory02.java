import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;

public class JavassistProxyFactory02 {
    public Object getProxy(Class clazz) throws InstantiationException, IllegalAccessException {
        ProxyFactory f = new ProxyFactory();
        f.setSuperclass(clazz);
        f.setFilter(m -> {
            // ignore finalize()
            return !m.getName().equals("finalize");
        });
        Class c = f.createClass();
        MethodHandler mi = (self, m, proceed, args) -> {
            System.out.println("Name: " + m.getName());
            return proceed.invoke(self, args);  // execute the original method.
        };
        Object foo = c.newInstance();
        ((Proxy) foo).setHandler(mi);
        return foo;
    }
}

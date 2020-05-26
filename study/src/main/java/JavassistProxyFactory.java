import javassist.util.proxy.ProxyFactory;

public class JavassistProxyFactory<T> {
    private T target;

    public void setTarget(T target) {
        this.target = target;
    }

    @SuppressWarnings("deprecation")
    public T getProxy() throws InstantiationException, IllegalAccessException {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(target.getClass());
        proxyFactory.setHandler((self, thismethod, proceed, args) -> {
            System.out.println("--------------------------------");
            System.out.println(self.getClass());
            System.out.println("要调用的方法名：" + thismethod.getName());
            System.out.println(proceed.getName());
            System.out.println("开启事务-------");
            Object result = proceed.invoke(self, args);
            System.out.println("提交事务-------");
            return result;
        });
        return (T) proxyFactory.createClass().newInstance();
    }

}

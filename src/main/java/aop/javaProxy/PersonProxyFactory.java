package aop.javaProxy;

//import aop.demo.PersonImpl;
import aop.cglib.interfac.PersonImpl;
import aop.demo.Speakable;

public class PersonProxyFactory {
    public static Speakable newJdkProxy() {
        // 代理PersonImpl
        DynamicProxy dynamicProxy = new DynamicProxy(new PersonImpl());
        Speakable proxy = dynamicProxy.getProxy();
        return proxy;
    }
}

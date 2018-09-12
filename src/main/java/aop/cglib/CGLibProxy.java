package aop.cglib;

import aop.MonitorSession;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements net.sf.cglib.proxy.MethodInterceptor {

    private static CGLibProxy instance = new CGLibProxy();
    private CGLibProxy() {
    }
    public static CGLibProxy getInstance() {
        return instance;
    }

    private Enhancer enhancer = new Enhancer();
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        MonitorSession.begin(method.getName());
        Object object = proxy.invokeSuper(obj, args);
        MonitorSession.end();
        return object;
    }

    @SuppressWarnings("unchacked")
    public <T> T getProxy(Class<T> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }
}

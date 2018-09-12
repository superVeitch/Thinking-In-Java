package proxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void consumer(Apple apple) {
        apple.add();
        apple.edit();
    }
    public static void main(String[] args) {
        Apple apple = (Apple) Proxy.newProxyInstance(Apple.class.getClassLoader(),new Class[]{Apple.class},
                new DynamicProxyHandler(new AppleImpl()));
        consumer(apple);
    }



}

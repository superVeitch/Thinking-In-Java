package aop.cglib;

import aop.cglib.interfac.Person;

public class RunTest {
    public static PersonCglib newCglibProxy() {
        CGLibProxy cglibProxy = CGLibProxy.getInstance();
        PersonCglib proxy = cglibProxy.getProxy(PersonCglib.class);
        return proxy;
    }

    public static void main(String[] args) {
        System.out.println("******** cglib proxy ******** ");
        PersonCglib cglibProxy = newCglibProxy();
        cglibProxy.sayHi();
        cglibProxy.sayBye();

    }
}

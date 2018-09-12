package aop.javaProxy;

import aop.demo.Speakable;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("******** jdk dynamic proxy ******** ");
        Speakable jdkProxy = PersonProxyFactory.newJdkProxy();
        jdkProxy.sayHi();
        jdkProxy.sayBye();
    }
}

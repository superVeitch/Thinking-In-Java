package classLoader;

import java.lang.reflect.Method;

public class MyHandler implements MyInvocationHandler {

  private Man man;

  public MyHandler(Man man) {
    this.man = man;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
    method.invoke(man, args);
    return null;
  }
}

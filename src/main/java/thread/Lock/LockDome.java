package thread.Lock;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 锁变量
 */
public class LockDome {

  static ExecutorService es = Executors.newFixedThreadPool(3);
  private static void demo(String str) throws Exception{
    synchronized (str) {
      Thread.sleep(3000);
      System.out.println(str);
    }
  }

  public static void main(String[] args) throws Exception{
    List<String> l = Arrays.asList("test1", "test1", "test2");
    for (int i = 0; i < l.size(); i++) {
      System.out.println(l.get(i)+"1111");
      int finalI = i;
      es.submit(() -> {
        try {
          demo(l.get(finalI));
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }
  }
}

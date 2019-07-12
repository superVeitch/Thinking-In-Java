package classLoader;

public class Main {

  public static void main(String[] args) {
    Man man = new ManImpl();
    MyHandler myHandler = new MyHandler(man);

  }

}

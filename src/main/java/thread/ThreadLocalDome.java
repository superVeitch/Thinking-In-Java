package thread;

public class ThreadLocalDome {

    private static void demo() {
        Thread t = new Thread("test") {
            ThreadLocal<String> mStringThreadLocal = new ThreadLocal<String>(){
                @Override
                protected String initialValue() {
                    return Thread.currentThread().getName();
                }
            };

            @Override
            public void run() {
                super.run();
                System.out.println(mStringThreadLocal.get());
                mStringThreadLocal.set("this is a text");
                System.out.println(mStringThreadLocal.get());
            }
        };

        t.start();
    }

    private  static void RunnableDemo() {
    }
    public static void main(String[] args) {
        demo();
    }
}

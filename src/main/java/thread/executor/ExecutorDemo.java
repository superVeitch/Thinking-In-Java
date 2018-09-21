package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es1 = Executors.newFixedThreadPool(2);
        ExecutorService es2 = Executors.newSingleThreadExecutor(); //生成单个线程的线程executor
    }
}

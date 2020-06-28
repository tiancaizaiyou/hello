package cn.anygloble.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        ExecutorService es1 = Executors.newCachedThreadPool();
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        ExecutorService es3 = Executors.newScheduledThreadPool(2);

        Future<?> future = es.submit(new TestImpl("一"));
        System.out.println(future);
        es.execute(new TestImpl("ssss"));
        es.submit(new TestImpl("二"));
        es.submit(new TestImpl("三"));
        es.submit(new TestImpl("四"));
        es.submit(new TestImpl("五"));
        es.submit(new TestImpl("六"));

        /*Thread thread = new Thread(new TestImpl("222"));
        thread.start();
        thread.start();*/
    }
}

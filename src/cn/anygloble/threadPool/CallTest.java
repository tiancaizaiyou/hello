package cn.anygloble.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new CallableTest());
        Thread thread = new Thread(futureTask);
        thread.start();
        String s = futureTask.get();
        System.out.println(s);
    }
}

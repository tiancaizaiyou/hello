package cn.anygloble.ThreadTest;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        /*RunnableImpl runnable = new RunnableImpl();
        Thread thread0 = new Thread(runnable,"wusongTest1");
        Thread thread1 = new Thread(runnable,"wusongTest2");
        Thread thread2 = new Thread(runnable,"wusongTest3");
        thread0.start();
        thread1.start();
        thread2.start();*/
        Thread thread = new Thread(() -> {
            for (int i = 0; i <66 ; i++) {
                System.out.println("运行："+ i);
            }
        });
        thread.start();
        String name = Thread.currentThread().getName();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(name);
    }
}

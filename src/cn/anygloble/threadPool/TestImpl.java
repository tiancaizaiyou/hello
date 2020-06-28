package cn.anygloble.threadPool;

public class TestImpl implements Runnable {
    private String name;

    public TestImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"执行任务"+name);
    }
}

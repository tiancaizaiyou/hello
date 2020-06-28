package cn.anygloble.test0427;

public class Test extends Object {
    public static void main(String[] args) {
        MyThreadImpl thread = new MyThreadImpl();
        Thread a = new Thread(thread);
        Thread b = new Thread(thread);
        Thread c = new Thread(thread);
        a.start();
        b.start();
        c.start();
        System.out.println(Thread.State.BLOCKED);
    }
}

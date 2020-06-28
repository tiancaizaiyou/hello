package cn.anygloble.ThreadTest;

public class Person extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("run:" + i);
        }
    }
}

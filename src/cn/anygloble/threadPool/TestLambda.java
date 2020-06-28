package cn.anygloble.threadPool;

public class TestLambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("ddd")).start();
    }
}

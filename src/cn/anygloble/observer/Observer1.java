package cn.anygloble.observer;

public class Observer1 implements Message {
    @Override
    public void sendMassage(String s) {
        System.out.println(s + "----观察者1");
    }
}

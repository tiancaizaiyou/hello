package cn.anygloble.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Subject subject = new Subject();
        subject.addMessage(observer1);
        subject.addMessage(observer2);
        subject.notifyMessage("sss");
    }
}
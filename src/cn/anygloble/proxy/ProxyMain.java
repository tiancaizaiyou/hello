package cn.anygloble.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Message message = new SubjectProxy();
        message.send();
        message.send1();
    }
}

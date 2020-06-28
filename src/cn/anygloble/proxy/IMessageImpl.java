package cn.anygloble.proxy;

public class IMessageImpl implements Message {
    @Override
    public void send() {
        System.out.println("发送信息");
    }

    @Override
    public void send1() {
        System.out.println("发送消息1");
    }
}

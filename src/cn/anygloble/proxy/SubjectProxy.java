package cn.anygloble.proxy;

public class SubjectProxy implements Message {
    Message message = new IMessageImpl();
    @Override
    public void send() {
        before();
        message.send();
        end();
    }

    @Override
    public void send1() {
        before();
        message.send1();
        end();
    }

    private void end() {
        System.out.println("方法执行后");
    }

    private void before() {
        System.out.println("方法执行前");
    }
}

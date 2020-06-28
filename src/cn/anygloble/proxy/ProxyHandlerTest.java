package cn.anygloble.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandlerTest {
    public static void main(String[] args) throws Throwable {
        Message tar = new IMessageImpl();
        Object proxy = Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                //这里可以进行所谓的AOP编程
                //在调用具体函数方法前，执行功能处理
                System.out.println("方法执行前");
                result = method.invoke(tar,args);
                //在调用具体函数方法后，执行功能处理
                System.out.println("方法执行后");
                return result;
            }
        });
        Message message = (Message) proxy;
        message.send();
        message.send1();

        ProxyHandler proxy1 = new ProxyHandler();
        Message message1 = (Message) proxy1.bind(tar);
        message1.send();
        message1.send1();
    }
}

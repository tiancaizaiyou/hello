package cn.anygloble.reflect;

import com.sun.deploy.util.StringUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 用配置文件实现类方法的自动执行
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        Properties pro = new Properties();
        //1.1
        /*ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);*/
        //1.2
        pro.load(new FileInputStream("C:\\Users\\wusong\\IdeaProjects\\hello\\src\\pro.properties"));

        //2.获取配置文件中的定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class<?> aClass = Class.forName(className);

        //4.创建对象
        Object obj = aClass.newInstance();

        //5.获取方法对象
        Method method = aClass.getMethod(methodName);

        //6.执行方法
        method.invoke(obj);

    }
}

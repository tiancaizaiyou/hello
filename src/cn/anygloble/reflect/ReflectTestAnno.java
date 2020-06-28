package cn.anygloble.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 用注解实现类方法的自动执行
 */
@MyAnnotation(className = "cn.anygloble.reflect.Student",methodName = "eat")
public class ReflectTestAnno {

    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTestAnno> cla = ReflectTestAnno.class;
        //1.2获取注解对象
        MyAnnotation annotation = cla.getAnnotation(MyAnnotation.class);
        //实质上是在内存中生产了一个该注解接口的子类实现对象MyAnnotationImpl
        // MyAnnotation annotation = new MyAnnotationImpl();
        /**
         public class MyAnnotationImpl implements MyAnnotation{
                public String className(){
                    return "cn.anygloble.reflect.Student"；
                }
                public String methodName(){
                    return "eat";
                }
         }
         */
        //1.3调用注解对象中的定义的抽象方法，获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();

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

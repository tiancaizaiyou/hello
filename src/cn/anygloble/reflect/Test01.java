package cn.anygloble.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Student> studentClass = Student.class;
        Student stu = studentClass.newInstance();
        stu.setAge(11);
        stu.setName("ssss");
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("seat")){
                String s = (String) method.invoke(stu,"测试");
                System.out.println(s);
            }
        }

        /*String[] str = "张三:10|李四:20".split("\\|");
        System.out.println(str.length);
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println(Student.class.getClassLoader());
        System.out.println(Student.class.getClassLoader().getParent());
        System.out.println(Student.class.getClassLoader().getParent().getParent());*/
    }
}

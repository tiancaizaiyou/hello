package cn.anygloble.reflect;


import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class clazz = Person.class;
        Person person = (Person) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);//暴力反射
        name.set(person,"张三");
        System.out.println(person);
    }
}

package cn.anygloble.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Singleton singleton = Singleton.getInsetence();
        Singleton singleton1 = Singleton.getInsetence();
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton2 = declaredConstructor.newInstance();
        System.out.println(singleton==singleton1);
        System.out.println(singleton==singleton2);
    }
}

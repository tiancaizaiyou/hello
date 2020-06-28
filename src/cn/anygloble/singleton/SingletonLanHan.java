package cn.anygloble.singleton;

public class SingletonLanHan {
    private static SingletonLanHan instance;
    private SingletonLanHan(){
    }
    public static SingletonLanHan getInstance(){
        if (instance == null){
            synchronized (SingletonLanHan.class){
                if (instance == null){
                    instance = new SingletonLanHan();
                }
            }
        }
        return instance;
    }
}

package cn.anygloble.singleton;

public class SingletonStatic {
    private static class SingletonHolder{
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }
    private SingletonStatic(){
    }
    public static SingletonStatic getInstance(){
        return SingletonHolder.INSTANCE;
    }
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}

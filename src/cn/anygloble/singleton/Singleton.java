package cn.anygloble.singleton;

public class Singleton {
    private static Singleton INSETENCE = new Singleton();

    private Singleton() {
    }
    public static Singleton getInsetence(){
        return INSETENCE;
    }
}

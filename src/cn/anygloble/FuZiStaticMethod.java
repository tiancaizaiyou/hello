package cn.anygloble;

public class FuZiStaticMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        Zi.method();
        Fu fu = new cn.anygloble.son.Fu();
        System.out.println(fu.num);
        cn.anygloble.son.Fu fu1 = (cn.anygloble.son.Fu) fu;
        fu1.method1();
    }
}

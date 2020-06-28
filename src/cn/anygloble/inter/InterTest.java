package cn.anygloble.inter;

public class InterTest {
    public static void main(String[] args) {
        Outer.Inter inter = new Outer().new Inter();
        inter.method();
        Outer outer = new Outer();
        outer.method();
        outer.method2();
    }
}

package cn.anygloble;

public interface testImp {
    int A = 10;
    public void test();
    public static void testStatic(){
        System.out.println("静态方法");
    }
    public abstract void testAbstract();
    default void testSy(){
        System.out.println("");
    }
}

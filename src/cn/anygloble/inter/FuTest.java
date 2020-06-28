package cn.anygloble.inter;


public class FuTest {
    public static void main(String[] args) {
        Fu fu = new Fu(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现");
            }

            @Override
            public void method2() {
                System.out.println("");
            }
        };
        fu.method();
    }
}

package cn.anygloble.threadPool;

public class IFunctionTest {
    public static void main(String[] args) {
        //静态方法引用
        IFunction<Integer,String> iFunction = String :: valueOf;
        String change = iFunction.change(100);
        System.out.println(change);
        //Lambda表达式实现
        IFunction<Integer,String> iFunction1 = i -> String.valueOf(i);
        String change1 = iFunction1.change(200);
        System.out.println(change1);

    }
}

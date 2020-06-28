package cn.anygloble.threadPool;

public class CalculatorTest {
    public static void main(String[] args) {
        int c = invokeCalc(10,20,(a,b)->a+b);
        System.out.println(c);
        Calculator calculator = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculator.calc(10,20));
    }
    private static int invokeCalc(int a , int b, Calculator calculator){
        return calculator.calc(a,b);
    }
}

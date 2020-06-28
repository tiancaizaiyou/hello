package cn.anygloble;

public class Fu {
    int num = 20;
    public static void method(){
        System.out.println("父类静态方法");
    }
    public <T> void methodTest(T t){
        System.out.println(t);
    }
}

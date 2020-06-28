package cn.anygloble.ThrowableTest;

public class ThrowableTest {
    public static void main(String[] args) throws Exception {
        method();
    }

    private static void method() throws Exception {
        if(1==1){
            throw new Exception("dd");
        }
        try {
            int a = 10/0;
        }catch (Exception e){
            //e.printStackTrace();
            e.getMessage();
            e.toString();
        }
    }
}

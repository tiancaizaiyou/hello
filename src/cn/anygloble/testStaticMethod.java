package cn.anygloble;

import java.util.Arrays;

public class testStaticMethod {
    public static void main(String[] args) {
        listTest list1 = new listTest();
        list1.method();
        list1.methodStatic();
        listTest.methodStatic();

        int[] arrays = {2,7,4,9};
        String s = Arrays.toString(arrays);
        System.out.println(s);
    }
}

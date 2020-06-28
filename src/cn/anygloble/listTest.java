package cn.anygloble;

import java.util.ArrayList;

public class listTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵又廷");
        list.add("赵丽颖");
        list.add("迪丽热巴");
        int length = "sddsfsdfasdfasd".length();
        System.out.println(length);
        int j = new Integer("100");
        System.out.println(j);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        byte[] bytes = "dfgdf".getBytes();
    }

    public void method(){
        System.out.println("普通成员方法！");
    }
    public static void methodStatic(){
        System.out.println("静态方法！");
    }
}

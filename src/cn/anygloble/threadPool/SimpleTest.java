package cn.anygloble.threadPool;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleTest {
    public static void main(String[] args) {
       SimpleFunction<Simple> s = Simple::new;
       System.out.println(s.creat("张三",19));

       //方法引用及Lambda表达式在集合遍历中的应用
       ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"1","2","3","4");
        //方法引用
        arrayList.forEach(System.out::println);
        //Lambda表达式
        arrayList.forEach(e -> {if (e =="3"){
            System.out.println(e);
        }});

        arrayList.removeIf(e -> e=="1");
        System.out.println(arrayList);
    }
}

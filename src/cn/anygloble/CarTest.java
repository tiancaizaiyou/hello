package cn.anygloble;

import cn.anygloble.inter.Outer;

import java.lang.reflect.Array;
import java.util.*;

public class CarTest {
    public static void main(String[] args) {
        /*Car car = new Benchi("奔驰");
        String a = new String("奔驰");
        System.out.println(car.name);
        System.out.println(car);
        System.out.println(a);*/
        /*Date date = new Date();
        Date date1 = new Date(1586681009897L);
        long l = System.currentTimeMillis();
        System.out.println(date1);
        System.out.println(l);*/
        /*long start = System.currentTimeMillis();
        for (int i=0;i<=9999;i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序耗时："+ (end-start)+"毫秒");*/
        //----------------------
        /*String[] b = new String[10];
        b[0] = "1";
        b[1] = "2";
        b[2] = "3";
        b[3] = "4";
        b[4] = "5";
        for (String a:b) {
            System.out.println(a);
        }
        List <String> a = new LinkedList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        for (String as:a) {
            System.out.println(as);
        }
        a.forEach((str) -> {System.out.print(str +"、");});
        System.out.println(a.get(1));*/
        //------------
        Set <String> a = new HashSet<>();
        a.add("sss");
        a.add("sss");
        a.add("ddd");
        a.add("aaa");
        System.out.println(a);
        System.out.println("sss".hashCode());
        Iterator<String> iteratorVar = a.iterator();
        Iterator<String> stringIterator = a.iterator();
        while(stringIterator.hasNext()){
            String str = stringIterator.next();
            System.out.println(str);
        }

        System.out.println("-------------");
        demo01();
        System.out.println("-------------");

        Integer[] b = new Integer[10];

        for (Integer s:b) {
            System.out.println(s);
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);
        System.out.println(map.put("four",4));
        System.out.println(map.put("four",5));
        System.out.println(map);
        map.put("five",6);
        System.out.println(map);
        map.put("seven",8);
        System.out.println(map);
        System.out.println(System.getProperty("file.encoding"));
        System.out.println("-------------");
        demo02("2222");
        Fu fu = new Fu();
        fu.methodTest("ssss");
        FanXingTest<String> fanXingTest = new FanXingTest<>();
        FanXingTest<Integer> fanXingTest1 = new FanXingTest<>();
        System.out.println("-----------");
        List<String> list1 = new ArrayList<>();
        list1.add("sdfsd");
        list1.add("sdddd");
        List<Integer> list2 = new ArrayList<>();
        list2.add(111);
        list2.add(222);
        demo03(list1);
        demo03(list2);
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        HashSet<String> set = new HashSet<>();
        set.add("通话");
        set.add("重地");
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("通话");
        String s4 = new String("重地");
        System.out.println(s1.equals(s2));
        Object s5 = new String("123");
        Object s6 = new String("123");
        System.out.println(s5.equals(s6));
        System.out.println("----------------");
        System.out.println(s3.equals(s4));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1==s2);
        Fu fu1 = new Fu();
        Fu fu2 = new Fu();
        System.out.println(fu1);
        System.out.println(fu2);
        System.out.println(fu1.hashCode());
        System.out.println(fu2.hashCode());

//        Class<T> clazz = fu.getClass();
//        System.out.println(clazz);
    }

    private  static void demo03(List<?> list) {
        Iterator<?> iteratorVar = list.iterator();
        while (iteratorVar.hasNext()){
            Object next = iteratorVar.next();
            System.out.println(next);
        }
    }

    private static <T> void demo02(T t) {
        System.out.println(t);
    }

    private static void demo01() {
        List<String> a = new ArrayList<>();
        a.add("ssss");
        a.add("tttt");
        a.add("eeee");
        a.add("rrrr");
        Iterator<String> iteratorVar = a.iterator();
        while (iteratorVar.hasNext()){
            String next = iteratorVar.next();
            System.out.println(next);
        }
    }
}

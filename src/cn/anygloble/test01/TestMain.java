package cn.anygloble.test01;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Collections.addAll(list,new Person("张三",18),new Person("李四",19),new Person("b王五",40),new Person("a王五",40));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge();
                if (result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);
        System.out.println("-----------------");
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",290);
        map.put("张四",292);
        map.put("张五",293);
        map.put("张六",294);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + map.get(s));
        }
        System.out.println("---------------");
        Set<Map.Entry<String,Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : set1) {
            System.out.println(stringIntegerEntry.getKey()+":=" + stringIntegerEntry.getValue());
        }
        System.out.println("---------------");
        Iterator<Map.Entry<String, Integer>> iterator = set1.iterator();
        /*while (iterator.hasNext()){
            System.out.println(iterator.next().getKey() + "=" + iterator.next().getValue());
        }*/

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"="+ value);
        }
        /*

         */

    }
}

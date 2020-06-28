package cn.anygloble.io;

import cn.anygloble.Car;
import cn.anygloble.test01.Person;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class lenTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        int n = 10;
        System.out.println(n+(n >> 1));
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Queue<String> queue = new PriorityQueue<>();
        queue.add("ss");
        /*TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car("ss"));
        treeSet.add(new Car("ss"));
        treeSet.forEach(System.out::println);
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("sss",1);*/
        //Array array = Array.newInstance();
        /*ArrayList<String> arrayList = new ArrayList<>(13);
        arrayList.add("ssss");
        arrayList.add("sssa");
        arrayList.add("sssd");
        arrayList.add("sssf");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sss");
        linkedList.add("ssf");
        linkedList.add("ssd");
        System.out.println(linkedList.get(2));
        System.out.println(arrayList.get(3));
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("1",23);
        hashMap.put("2",24);
        hashMap.put("3",25);
        hashMap.put("4",26);
        hashMap.put("5",27);
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            Integer integer = hashMap.get(s);
            System.out.println(s+":"+integer);
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+":"+value);
        }
        String d= "ss";
        System.out.println(d.hashCode());

        char value1[] = {'重','地'};
        char value2[] = {'通','话'};
        int h1 = 0;
        int h2 = 0;
        for (int i = 0; i < value1.length; i++) {
            h1 = 31 * h1 + value1[i];
        }
        for (int i = 0; i < value2.length; i++) {
            h2 = 31 * h2 + value2[i];
        }
        System.out.println(h1);
        System.out.println(h2);
*/


        //int length = d.value.length;
        /*boolean ss = d.equals("ss");
        Person person = new Person();
        Person person1 = new Person();
        boolean equals = person.equals(person1);
        System.out.println(equals);*/
        /*Integer i = new Integer(1);
        System.out.println(i+2);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("s",1);
        hashMap.put("d",2);
        hashMap.put("f",3);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Integer s = hashMap.get("s");
        System.out.println(s);
        Set<String> set = hashMap.keySet();
        for (String s1 : set) {
            System.out.println(s1+":"+hashMap.get(s1));
        }
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("q");
        hashSet.add("r");
        hashSet.add("t");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Class<String> stringClass = (Class<String>)Class.forName("java.lang.String");
        Object ob=stringClass.newInstance();*/

    }
}

package cn.anygloble.ThreadTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkTest {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("sss");
        l.addFirst("sdsdsd");
        Iterator<String> iteratora = l.iterator();
        while (iteratora.hasNext()){
            String next = iteratora.next();
            System.out.println(next);
        }

    }
}

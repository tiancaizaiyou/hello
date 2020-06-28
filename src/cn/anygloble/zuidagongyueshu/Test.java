package cn.anygloble.zuidagongyueshu;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("输入两个数字：");
        int p=Integer.parseInt(scanner.next());
        int q=Integer.parseInt(scanner.next());
        int a = 0;
        int r = 0;
        if(p<q){
            a = p;
            p = q;
            q = a;
            r = method(p,q);
        }else if (p==q){
            r=p;
        }else {
            r = method(p,q);
        }
        System.out.println(p + "和" + q +"的最大公约数为：" + r);*/
        HashMap<String,Integer> hashMap = new HashMap<>();
        Set<Map.Entry<String,Integer>> set1 = hashMap.entrySet();
        
        Stack<String> s = new Stack<>();
        s.push("sss");
        s.push("dddd");
        s.pop();
        s.pop();
        System.out.println(s);
    }

    private static int method(int p , int q) {
        if(q==0) return p;
        int r = p % q;
        return method(q,r);
    }
}

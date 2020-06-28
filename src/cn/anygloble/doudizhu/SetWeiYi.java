package cn.anygloble.doudizhu;

import java.util.HashSet;

public class SetWeiYi extends Object {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("通话");
        set.add("重地");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s.hashCode());
        }
        System.out.println(1<<4);
    }
}

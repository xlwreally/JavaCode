package org.microsoft.xlw.day5;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<String> setall=new HashSet<>();
        setall.add("dsga");
        setall.add("efe");
        setall.add("dsga2");
        setall.add("efe2");
        setall.add("dsga3");
        setall.add("efe3");
        System.out.println(setall);
        Set<String> settree=new TreeSet<>(String::compareTo);
        settree.add("dsga");
        settree.add("efe");
        settree.add("dsga2");
        settree.add("efe2");
        settree.add("dsga3");
        settree.add("afe3");
        System.out.println(settree);
        SortedSet<String> sort=new TreeSet<String>();
        sort.add("babc");
        sort.add("abc1");
        sort.add("a1bc");
        sort.add("abc");
        sort.add("aaa");
        System.out.println(sort);
        System.out.println(sort.subSet("aaa","abc1"));

    }
}

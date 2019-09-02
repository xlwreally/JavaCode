package org.microsoft.xlw.day10.two;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        car c1=new car();
        car c2=new car();
        c1.setName("胡同学");
        c1.setPrice(666.6);
        c2.setName("胡同学");
        c2.setPrice(666.6);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        List<String> a=new ArrayList<String>();
        a.add("abc");
        a.add("bcd");

        for (String m:a
             ) {
            System.out.println(m);
        }
        System.out.println(a.size());
        System.out.println(a.contains("abc"));
        a.remove(1);
        for (String m:a
        ) {
            System.out.println(m);
        }
    }
}

package org.microsoft.xlw.day5;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(1213);
        li.add(21);
        li.add(21123132);
        li.sort(Integer::compareTo);
        for (Integer a:li
             ) {
            System.out.println(a);
        }
        System.out.println(li);
        System.out.println(li.remove(0));
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(0));

    }
}

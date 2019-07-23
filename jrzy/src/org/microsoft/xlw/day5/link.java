package org.microsoft.xlw.day5;

import java.util.LinkedList;

public class link {

    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(1);
        li.addLast(213);
        li.addFirst(231321);
        li.add(1,66666666);

        System.out.println(li);
        li.sort(Integer::compareTo);
        System.out.println(li);
        System.out.println(li.poll());
        System.out.println(li.peek());
        System.out.println(li.element());
        System.out.println(li.peek());
        System.out.println(li.peek());
        System.out.println(li);
        li.offer(7777777);
        System.out.println(li);

    }
}

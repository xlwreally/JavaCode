package org.microsoft.xlw.day8.cilcle;

public class main {
    public static void main(String[] args) {
        cilcle c=new cilcle(4,"yellow");
        rectrangle r=new rectrangle(6,4,"blue");
        total t=new total();
        System.out.println("c");
        t.perimeter(c);
        System.out.println("r");
        t.perimeter(r);

    }
}

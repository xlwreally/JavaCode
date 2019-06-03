package org.microsoft.xlw.day6.homework;

import java.util.Scanner;

public class IdCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Id id=new Id();
       while (!id.setStr(sc.nextLine()));
       id.print();

    }
}

package org.microsoft.xlw.day5.demo;

import org.microsoft.xlw.day5.vo.Id;

import java.util.Scanner;

public class IdCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Id id=new Id();
       while (!id.setStr(sc.nextLine()));
       id.print();

    }
}

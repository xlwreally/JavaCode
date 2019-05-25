package org.microsoft.xlw.day5.demo;


import java.util.Scanner;

public class Stringdemo {
    public static void main(String[] args) {
        String str="ABCABC";
        String str2="b13";
        byte by[]={};
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointCount(0,2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.concat("我带你们打"));
        System.out.println(str.indexOf("B",3));
        System.out.println(str.replaceAll("B","*"));
        System.out.println(str.substring(2,4));
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.replaceAll("fuck","****"));

    }
}

package org.microsoft.xlw.day3.demo;

import org.microsoft.xlw.day3.vo.Person;
import org.microsoft.xlw.day3.vo.Student;

import java.util.Date;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int a[]=new int[22];
        Scanner sc=new Scanner(System.in);

        Person p1=null;
        Person p2=new Person();
        p1=new Person();
        System.out.println(p1);
        p1.name="xlw";
        System.out.println("名字:"+p1.name);
        System.out.println(p2.age);
        Student pp1=new Student();
        pp1.birthday=new Date();
        System.out.println(pp1.birthday);
        System.out.println(sjb(2222));
        p1.run();

    }
    public static int sjb(int a)
    {
        a++;
        System.out.println(a);
        a++;
        return a;
    }
}

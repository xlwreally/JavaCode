package org.microsoft.xlw.day6.homework;

import java.util.Scanner;

public class bookmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         book bo[] =new book[777];
        for (int i=0;i<5;i++) {
            System.out.println("请输入地"+(i+1)+"本的名字");
           bo[i]=new book(sc.nextLine());
        }
        System.out.println("一共有"+bo[1].getCode()+"本");
        for (int i=0;i<5;i++)
            bo[i].print(i);

    }
}

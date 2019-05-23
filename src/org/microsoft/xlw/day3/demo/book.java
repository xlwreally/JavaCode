package org.microsoft.xlw.day3.demo;

import org.microsoft.xlw.day3.vo.Book;

import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if("a".equals(sc.nextLine())) {
            Book book=new Book(1);
            System.out.println("欢迎使用");
            System.out.print("请输入名称：");
            book.setTitle(sc.nextLine());
            System.out.print("请输入页码数：");
            book.setPageNum(sc.nextInt());
            book.detail();
        }
        else {
            Book book=new Book(0);
            System.out.println("欢迎使用");
            System.out.print("请输入种类：");
            book.setType(sc.nextLine());
            System.out.print("请输入名称：");
            book.setTitle(sc.nextLine());
            System.out.print("请输入页码数：");
            book.setPageNum(sc.nextInt());
            book.detail();
        }


    }
}

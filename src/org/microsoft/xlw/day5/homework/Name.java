package org.microsoft.xlw.day5.homework;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String total=sc.nextLine();
        String totals[]=total.split(" ");
        System.out.print("你好，"+totals[0]);

        if(total.endsWith("女"))
        {
            System.out.print("女士");
        }
        else System.out.print("先生");
    }
}

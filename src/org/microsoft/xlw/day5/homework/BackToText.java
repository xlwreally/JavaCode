package org.microsoft.xlw.day5.homework;

import java.util.Scanner;

public class BackToText {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String total=sc.nextLine();
        for (int i=0;i<total.length()/2;i++)
        {

            if(total.charAt(i)!=total.charAt(total.length()-i-1))
            {
                System.out.println("不是回文");
                System.exit(0);
            }
        }
        System.out.println("是回文");
    }
}

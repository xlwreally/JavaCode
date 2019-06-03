package org.microsoft.xlw.day5.homework;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String total=sc.nextLine();
        String res[]=total.split(" ");

        for (int m=0;m<res.length;m++){

            char tmp[]=res[m].toCharArray();
            for (int i = tmp.length-1; i >=0 ; i--) {
                System.out.print(tmp[i]);
            }
            System.out.print(" ");
        }
    }
}

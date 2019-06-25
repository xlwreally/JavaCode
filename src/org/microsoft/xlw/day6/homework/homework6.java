package org.microsoft.xlw.day6.homework;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine(),str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                str2+=str.charAt(i);
            }

        }
        System.out.println(str2);
        System.out.println(str.replaceAll("Java","J2EE"));
        System.out.println(str.charAt(7));
        System.out.println(str.replaceAll("0",""));
        System.out.println(str.replaceAll(" ",""));
    }

}

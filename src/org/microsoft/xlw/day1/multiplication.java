package org.microsoft.xlw.day1;;

import java.util.Scanner;

public class multiplication {
    public  static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(+j+"*"+i+"="+i*j+" ");
            System.out.print("\n");
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }
}

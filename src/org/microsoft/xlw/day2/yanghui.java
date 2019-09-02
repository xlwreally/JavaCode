package org.microsoft.xlw.day2;

import java.util.Scanner;

public class yanghui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arry[][]= new int[n][n];

        for(int i=0;i<n;i++)
        {
            arry[i][0]=1;
            arry[i][i]=1;
            for(int j=1;j<i;j++)
                arry[i][j]=arry[i-1][j-1]+arry[i-1][j];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
               System.out.print(arry[i][j]+"\t\t");
            System.out.println("");
        }



    }
}

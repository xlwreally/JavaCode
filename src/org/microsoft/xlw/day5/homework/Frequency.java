package org.microsoft.xlw.day5.homework;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String total=sc.nextLine();
        int i=total.length(),end=0,see,max=1;
        char totals[]=total.toCharArray();
        char tmp[]=new char[i];
        int time[]=new int[i];
        int n[]=new int[i];
        for(int m=0;m<i;m++)
        {
            see=0;
            for(int p=0;p<i;p++)
            {
                if(totals[m]==tmp[p])
                {

                    time[p]+=1;
                    see=1;
                }
               if(time[p]>max)
                   max=time[p];
            }
            if(see==0)
            {
                end++;
                tmp[end]=totals[m];
                time[end]=1;

            }

        }
        for(int m=1;m<end;m++) {
            if (time[m]==max)
                System.out.print("（频率最高）");
            System.out.print(tmp[m] + ":" + time[m] + "|");


        }
    }
}

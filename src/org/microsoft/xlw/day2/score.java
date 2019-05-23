package org.microsoft.xlw.day2;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println(factorials(sc.nextInt()));
        int score[],temp;
        score=new int[100];
        for(int i=0;i<score.length;i++)
        {

            score[i]=(int)(Math.random()*100);

        }
        print(score);
        System.out.println();
        for(int i=0;i<score.length;i++)
        {

            for(int j=1;j<score.length-i;j++)
            {
                if(score[j]<score[j-1])
                {
                    temp=score[j];
                    score[j]=score[j-1];
                    score[j-1]=temp;
                }
            }

        }
        print(score);
    }

    public static double factorials(int a) {
        double result=a;
        while(a--!=2)
            result*=a;
        return result;
    }

    public static void print(int score[]) {
        for(int i=0;i<score.length;i++)
        {
            System.out.print(score[i]+"\t" );
            if((i+1)%10==0)
                System.out.println("");
        }

    }
}

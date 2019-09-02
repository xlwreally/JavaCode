package org.microsoft.xlw.day1;

import java.util.Scanner;

public class wage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的利润,单位万元");
        double wage=sc.nextFloat(),result=0;
        if(wage<0)System.out.println("非法");
        else if(wage<=10)result=wage*0.1;
        else if(wage<=20)result=(wage-10)*0.075+1;
        else if(wage<=40)result=(wage-20)*0.05+1.75;
        else if(wage<=60)result=(wage-40)*0.03+2.75;
        else if(wage<=100)result=(wage-60)*0.15+3.35;
        else result=9.35+(wage-100)*0.1;
        System.out.println("恭喜你得到了"+result+"万");
    }

}

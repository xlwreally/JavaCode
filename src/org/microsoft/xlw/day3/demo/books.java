package org.microsoft.xlw.day3.demo;

import org.microsoft.xlw.day3.vo.BookData;

public class books {
    public static void main(String[] args) {
        BookData bo=new BookData("韭菜的自我修养");
        bo.setPrice(99.6);
        System.out.println(bo.getName()+"的价格是"+bo.getPrice());
        System.out.println(pluss(4));


    }
    public static double pluss(double n)
    {
        if(n==1)return 1;
        return n*pluss(n-1);
    }
}

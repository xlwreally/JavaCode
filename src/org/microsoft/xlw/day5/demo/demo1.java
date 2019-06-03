package org.microsoft.xlw.day5.demo;

import org.microsoft.xlw.day5.vo.Demo1;

public class demo1 {


    public static void main(String[] args) {
        Demo1 de=new Demo1(1,2,3);

        int ssss[]=new int[111],b=0;
        for (int a:ssss
             ) {


            ssss[b]=b++;


        }
        System.out.println(de.sum());

        de.setScore(ssss);
        System.out.println(de.getScore()[5]);
    }

}

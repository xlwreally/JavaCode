package org.microsoft.xlw.day3.demo;



import org.microsoft.xlw.day3.vo.Phone;

import java.util.Scanner;

public class Homework {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                Phone ph=new Phone();
                ph.model="SamSung";
                ph.type="SM-G9600";
                ph.verson=9.0;
                ph.cpu="SDM845";
                ph.ram="4GB";
                ph.rom="64GB";

                ph.setSeriesnumber(sc.nextLine());
                System.out.println("序列号"+ph.getSeriesnumber());
                        ph.display();
    }
}

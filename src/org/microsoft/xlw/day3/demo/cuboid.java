package org.microsoft.xlw.day3.demo;

import org.microsoft.xlw.day3.vo.Cuboid;

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Cuboid cu=new Cuboid();
        System.out.print("长：");
        cu.setX(sc.nextDouble());
        System.out.print("宽：");
        cu.setY(sc.nextDouble());
        System.out.print("高：");
        cu.setZ(sc.nextDouble());
        cu.print();
    }
}

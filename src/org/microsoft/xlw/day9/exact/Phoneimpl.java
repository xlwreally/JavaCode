package org.microsoft.xlw.day9.exact;

import java.util.Scanner;

public class Phoneimpl implements inter{
    Scanner sc=new Scanner(System.in);
    @Override
    public void setall() {
        phone s=new phone();
        s.setBand(sc.nextLine());
        s.setCpu(sc.nextLine());
        Data.Database[0]=s;
    }

    @Override
    public void printall() {
        System.out.printf(Data.Database[0].getBand()+Data.Database[0].getCpu());
    }
}

package org.microsoft.xlw.day3;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("23456");
        System.out.println(s);
        System.out.println(s.capacity());
        s.append("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.append("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.append("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.delete(0,400);
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.trimToSize();
        System.out.println(s.capacity());
        Runtime b= Runtime.getRuntime();
        System.out.println(b.freeMemory());

        System.gc();
        System.out.println(b.freeMemory());
        System.getProperties().list(System.out);
        String ss="safdgsh";
        StringBuffer a=new StringBuffer();
        s.replace(1,500,"这个是被替换的");
        System.out.println(s);
        System.out.println(s.length());
        Date D=new Date();
        System.out.println(D);
        Calendar cld=new GregorianCalendar();
        System.out.println(cld.get(Calendar.DATE));
        DateFormat df1=DateFormat.getDateTimeInstance();
        System.out.println(df1.format(new Date()));
    }
}

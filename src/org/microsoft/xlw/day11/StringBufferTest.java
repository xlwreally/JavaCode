package org.microsoft.xlw.day11;

import java.util.Properties;
import java.util.Random;
import java.util.Timer;

public class StringBufferTest {
    public static void main(String[] args) {
        long m=System.currentTimeMillis();
        String a = "sdS";
        StringBuffer str = new StringBuffer("sd");
        Timer t=new Timer();

        Integer i = 0;
        while (true) {
            i++;
            str.append(i);
            if (i==9)
                break;
        }
        System.out.println(str);
        str.delete(2,3);
        System.out.println(str);
        str.replace(3,9,"!!!!!!!!");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        Random s=new Random(7);
        System.out.println(s.nextInt());
        System.out.println(a.toUpperCase());
        System.out.println(str.indexOf("!",3));
        Runtime hh=Runtime.getRuntime();
        Process pro=null;
        System.out.println(hh.maxMemory());
        System.out.println(hh.freeMemory());

        try {
            pro=hh.exec("open /Applications/IINA.app");
            Thread.sleep(3000);

        }catch (Exception hhh)
        {
            System.out.println(hhh);
        }

        pro.destroy();

        while (true) {
            i++;
            str.append(i);
            if(i==100000)
            {
                System.out.println(hh.freeMemory());
                i=0;
                break;
            }


        }
        System.out.println("运行时间"+(System.currentTimeMillis()-m));

        System.out.println(System.getProperty("os.name"));
        System.gc();
        System.out.println(hh.freeMemory());
        str=null;
        System.gc();
        System.out.println(hh.freeMemory());


    }
}

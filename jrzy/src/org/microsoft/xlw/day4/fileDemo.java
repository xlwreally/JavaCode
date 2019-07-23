package org.microsoft.xlw.day4;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) throws Exception{
        File f=new File("/Users/xlwreally/Desktop/TEMP/file01.txt");
        File f2=new File(File.separator+"Users"+File.separator+"xlwreally");
        if (f.exists())
        f.delete();
        else f.createNewFile();

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        String str[]=f2.list();
        for (String s:str
             ) {
            System.out.println(s);
        }
        System.out.println("---------------");
        for (File s:f2.listFiles()
             ) {
            System.out.println(s);
        }

    }
}

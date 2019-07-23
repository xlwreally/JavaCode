package org.microsoft.xlw.day4;

import java.io.*;

public class filewrote {

    public static void main(String[] args) throws IOException {
        File f=new File("/Users/xlwreally/Desktop/TEMP/file01.txt");
        Writer w=new FileWriter(f,true);
        w.write("你好");
        w.close();
        FileReader rea=new FileReader(f);
        char Temp[]=new char[1024];
        int Tem=0,len=0;
        while ((Tem=rea.read())!=-1){
            Temp[len]=(char) Tem;
            len++;
        }
        System.out.println(f.length());
        System.out.println(new String(Temp,0,len));

    }
}

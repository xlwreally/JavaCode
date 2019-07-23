package org.microsoft.xlw.day4;

import java.io.*;

public class OutPut {
    public static void main(String[] args) throws Exception {
        File f=new File("/Users/xlwreally/Desktop/TEMP/file01.txt");
            if(f.exists())
            {
                OutputStream opst=new FileOutputStream(f);
                StringBuffer ss=new StringBuffer();
                for (int i = 0; i <123 ; i++) {
                    ss.append(i+"\n");
                }

                String str= ss.toString();
                byte ch[]=str.getBytes();
                for (Byte chs:ch
                ) {
                    opst.write(chs);
                }
                byte by[]=new byte[(int)f.length() ];
                InputStream ipst=new FileInputStream(f);
                StringBuffer SB=new StringBuffer();
                ipst.read(by);
                opst.close();

                System.out.println(new String(by));
            }else System.out.println("不存在");

    }
}

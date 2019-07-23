package org.microsoft.xlw.day4;

import java.io.*;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        File f1=new File(f);

        f=f.replace(".","_副本.");
        File f2=new File(f);

        if(f1.exists()){
            InputStream in=new FileInputStream(f1);
            OutputStream out=new FileOutputStream(f2);
            if(in!=null&&out!=null){
                System.out.println("正在复制");
                int temp=0;
                while ((temp=in.read())!=-1){
                    out.write(temp);
                }
            }
            in.close();
            out.close();
        }else System.out.println("没有这个文件");
    }
}

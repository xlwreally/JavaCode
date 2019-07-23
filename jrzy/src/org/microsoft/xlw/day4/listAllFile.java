package org.microsoft.xlw.day4;

import java.io.File;
import java.util.List;

public class listAllFile {
    public static void main(String[] args) {
        long a=0;
        File Macintosh=new File(File.separator);

//        System.out.println(print(Macintosh,a));

    }
    public static Long print(File file, Long a){
        if(file!=null){
            if(file.isDirectory()){

                if (file.listFiles()!=null){
                    for (File s:file.listFiles()
                         ) {
                        print(s,a);
                    }
                }
            }else {
                a++;
//                System.out.println(file);
            }
        }
        return a;
    }
}

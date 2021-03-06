package org.microsoft.xlw.day1.data;

import org.microsoft.xlw.day1.vo.Person;


import java.io.*;
import java.util.LinkedList;
public class DataBase {
    public static LinkedList<Person> data=new LinkedList<>();
    public static void save()throws Exception{
        File f=new File("/Users/xlwreally/Desktop/TEMP/管理系统.data");
        OutputStream ops=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(ops);
        oos.writeObject(data);
        oos.close();
    }
    public static void read()throws Exception {
        File f=new File("/Users/xlwreally/Desktop/TEMP/管理系统.data");
        if(f.exists())
        {
            InputStream ips=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(ips);
            data=(LinkedList<Person>) ois.readObject();
            ois.close();
        }else {
            f.createNewFile();
        }

    }

}

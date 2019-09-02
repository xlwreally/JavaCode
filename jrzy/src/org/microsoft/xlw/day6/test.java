package org.microsoft.xlw.day6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019-08-02 16:52
 */
public class test {
    public static void main(String[] args) {
        Map<Integer,String> ma=new HashMap<Integer,String>();
        ma.put(1,"A");
        ma.put(2,"B");
        ma.put(3,"c");
        ma.put(4,"D");
        ma.put(9,"A");
        for ( Map.Entry<Integer, String> maa:ma.entrySet()
             ) {
            System.out.println(maa);
        }
    }
}

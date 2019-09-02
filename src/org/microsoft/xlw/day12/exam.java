package org.microsoft.xlw.day12;

import java.lang.reflect.Array;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019-08-01 11:53
 */
public class exam {
    public static void main(String[] args) {
        char[] a="西安是一个十三朝古都".toCharArray();
        for (char as:a
             ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(as);

        }

    }
}

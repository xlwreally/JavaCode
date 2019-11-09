package org.microsoft.xlw.fun;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019/9/12 21:45
 */
public class time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <100000 ; i++) {
            String s=new String();
        }
        System.out.println(System.currentTimeMillis());
    }
}

/*版权：熊立伟
 *开发日期：2019年4月27日 00：00：00
 * 开发人：熊立伟
 * 功能
 * ATM
 */


package org.microsoft.xlw.day1;;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args)
    {
        boolean x=true;
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println("欢迎使用ATM");
        System.out.println("请输入用户名");
        while(x)
        if(sc.nextLine().equals("xlwreally"))
        {
            x=false;
            System.out.println("欢迎xlw");
            System.out.println("你想取多少钱");
            int need=sc.nextInt();
            if(need<=201314)
            {

                int have=201314-need;
                System.out.println("恭喜你取出了"+need+"元，你还有"+have+"元");
            }
            else
            {
                System.out.println("你没这么多钱！！！！");
            }




        }
        else System.out.println("没这个人，再来");

    }



}

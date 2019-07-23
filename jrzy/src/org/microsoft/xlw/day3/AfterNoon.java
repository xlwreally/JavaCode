package org.microsoft.xlw.day3;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

public class AfterNoon {
    public static void main(String[] args) {
        int[] s=new int[7];
        double radius=3.5;
        Random rd=new Random();
        System.out.println(Math.PI*Math.pow(2,radius));
        System.out.println(Math.ceil(3.214));
//        BigInteger intt=new BigInteger("545");
//        for (int i = 0; i <20 ; i++) {
//           intt=intt.pow(2);
//           System.out.println(intt);
//
//        }
        System.out.println("今天的开奖号码是：");
        for (int i = 0; i <7 ; i++) {
            s[i]=rd.nextInt(35);//产生彩票随机数
            for (int j=0;j<i;j++) {
                if(s[j]==s[i])//如果出现重复的彩票代码则再次执行
                    i--;
                break;
            }

        }
        for (int j:s
             ) {
            System.out.print(j+1+"\t");
        }
        System.out.println();
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.TRADITIONAL_CHINESE);//按照台湾省的要求格式化
        System.out.println(nf.format(2222));
        DecimalFormat df=new DecimalFormat("#######.###\u2030");//按照指定格式格式化
        System.out.println(df.format(2345678));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(242522));//一行写出
        if(Pattern.compile("\\d{4}-\\d{2}-\\d{2}").matcher("2000-10-21").matches())
        {
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
        if("2000-10-21".matches("\\d{4}-\\d{2}-\\d{2}"))//简单比较
        {
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }

    }
}

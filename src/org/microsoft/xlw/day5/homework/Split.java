package org.microsoft.xlw.day5.homework;
public class Split {
    public static void main(String[] args) {
        String s="name=zhangsan age=18 classNo=090728";
        String res[]=s.split(" ");
        for (String tmp:res
             ) {
            String tmp2[]=tmp.split("=");
            System.out.print(tmp2[1]+" ");
        }
    }
}

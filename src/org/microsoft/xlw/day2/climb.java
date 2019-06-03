package org.microsoft.xlw.day2;

public class climb {
    public static void main(String[] args) {
        int aready=0,n=0;
        while(true)
        {
            n++;
            aready+=3;
            if (aready>=7)break;
            aready-=2;

        }
        System.out.println(n);
    }
}

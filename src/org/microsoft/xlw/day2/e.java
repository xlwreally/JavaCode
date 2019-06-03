package org.microsoft.xlw.day2;

public class e {
    public static void main(String[] args) {
        double e=1,n=100,r=1,plus=1;

        while(n--!=1)
        {
            r=n;
            plus=n;
            while(r--!=1)
            {
                plus*=r;


            }
            System.out.println(plus);
            e+=1/plus;
        }
        System.out.println(e);
    }
}

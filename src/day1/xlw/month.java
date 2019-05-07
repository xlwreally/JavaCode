package day1.xlw;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
                int result=0,i=0;
                switch(n)
                {
                    case 1:
                         result=31;
                        break;
                    case 2:
                         result=29;
                        break;
                    case 3:
                        result=31;
                        break;
                    case 4:
                    while (true)
                    {
                        i++;
                        if(i%2==1)
                        System.err.println(i);
                        else System.out.println(i);

                    }





                }
                System.out.println(result);
    }
}

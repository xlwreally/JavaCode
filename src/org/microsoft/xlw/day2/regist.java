package org.microsoft.xlw.day2;

import java.util.Scanner;

public class regist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username,passsword="",t;
        int n=0;
        System.out.println("******Regist******");
        System.out.println("Please enter you name");
        username=sc.nextLine();
        while(passsword=="")
        {
            System.out.println("Please enter you password");
            t=sc.nextLine();
            System.out.println("Please retry you password");

            if(t.equals(sc.nextLine()))
                passsword=t;
            else
                System.out.println("Password didn't ,try again");
        }
        System.out.println("******log in******");
        while (true)
        {
            System.out.println("Please enter you name");
            if(username.equals(sc.nextLine()))
            {
                System.out.println("Please enter you password");
                if(passsword.equals(sc.nextLine()))
                {
                    System.out.println("Welcome lord "+username);
                    break;
                }

            }
            System.out.println("Wrong user or password");
            n++;
            if(n==4)
            {
                System.out.println("Too many repetitions,please try again tomorrow");
                break;
            }
        }



    }

}

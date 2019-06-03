package org.microsoft.xlw.day5.homework;

import java.util.Scanner;

public class regist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username,passsword="",t;
        int n=0;
        System.out.println("******Regist******");
        System.out.println("Please enter you name");
        username=sc.nextLine();
        username=username.replaceAll("china","*****");
        username=username.replaceAll("中国","**");
        System.out.println("You name is:"+username);
        while(passsword=="")
        {
            System.out.println("Please enter you password");
            t=sc.nextLine();
            if(t.length()<8||t.length()>16)
            {
                System.out.println("The password must be 8-16 digits in length");
                continue;
            }
            System.out.println("Please retry you password");

            if(t.equals(sc.nextLine()))
                passsword=t;
            else
                System.out.println("Password didn't match,try again");
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
            if(n==3)
            {
                System.out.println("Too many repetitions,please try again tomorrow");
                break;
            }
        }



    }
}

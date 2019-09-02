package org.microsoft.xlw.day6.bank;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Login lg1=new Login();
		Login lg2=new Login();
		lg2.setUserName("admin");
		lg2.setPassword("123456");
		int count=0;
		while(true)
		{
			System.out.println("===========登录=============");
			System.out.println("请输入用户名");
			lg1.setUserName(scan.next());
			System.out.println("请输入密码");
			lg1.setPassword(scan.next());
			
			if(lg1.login(lg2))
			{
				System.out.println("登入成功");
				Bank.menu();
				break;
			}else
			{
				System.out.println("请再次输入");
				count++;
				if(count==3)
				{
					System.out.println("你可以走了");
					System.exit(0);
				}
			}
		}
		
		
	}

}

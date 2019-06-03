package org.microsoft.xlw.day6.bank;

import java.util.Scanner;

public class Bank {
	public static  void menu()
	{
		Scanner scan=new Scanner(System.in);


		while(true)
		{
			System.out.println("============银行系统=============");
			System.out.println("1、开户");
			System.out.println("2、存款");
			System.out.println("3、取款");
			System.out.println("4、查询");
			System.out.println("5、转账");
			System.out.println("0、退出");
			System.out.println("请输入操作数：");
			int num =scan.nextInt();
			Account a1 = new Account(); //账户
			switch(num) {
				case 1:

					System.out.println("流水号");
					a1.setId(scan.next());
					System.out.println("账号：");
					a1.setAccountID(scan.next());
					System.out.println("密码：");
					a1.setPassword(scan.next());
					System.out.println("设置余额");
					a1.setBalance(scan.nextDouble());

					Data.accArr[0] = a1;
					System.out.println(Data.accArr[0].getBalance());
					break;
				case 2:
					System.out.println("存款金额：");
					Data.accArr[0].setBalance((Data.accArr[0].getBalance() + scan.nextDouble()));
					System.out.println(Data.accArr[0].getBalance());
					break;
				case 3:
					break;
				case 4:
					System.out.println("你的余额为:"+Data.accArr[0].getBalance()+"你的流水号是:"+Data.accArr[0].getId()+"你的账号是："+Data.accArr[0].getAccountID());
					break;
				case 5:
					System.out.println("请输入你要转给熊立伟多少钱");
					Data.accArr[0].setBalance(Data.accArr[0].getBalance()-scan.nextInt());
					System.out.println("转账成功且不可撤销");
					System.out.println("你的余额为:"+Data.accArr[0].getBalance());
					break;
				case 0:
					break;

				default:
					break;
			}
		}
	}
}

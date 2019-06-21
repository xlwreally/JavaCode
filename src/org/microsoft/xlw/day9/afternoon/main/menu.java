package org.microsoft.xlw.day9.afternoon.main;

import org.microsoft.xlw.day9.afternoon.data.Data;
import org.microsoft.xlw.day9.afternoon.factory.Factory;
import org.microsoft.xlw.day9.afternoon.vo.Car;

import java.util.Scanner;

public class menu {
    private int temp;
    public menu() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("==========4s店管理系统==========");
            System.out.println("1、增加汽车信息");
            System.out.println("2、删除汽车信息");
            System.out.println("3、查询汽车信息");
            System.out.println("4、修改汽车信息");
            System.out.println("5、汽车信息列表");
            System.out.println("0、退出系统");
            System.out.println("请输入操作数据：");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    Scanner scan1 = new Scanner(System.in);
                    Car c1 = new Car();
                    System.out.println("编号：");
                    c1.setID(scan1.next());
                    System.out.println("名称：");
                    c1.setName(scan1.next());
                    System.out.println("颜色：");
                    c1.setColor(scan1.next());
                    System.out.println("价格：");
                    c1.setPrice(scan1.nextDouble());
                    System.out.println("厂家：");
                    c1.setCompany(scan1.next());
                    //设置汽车对象，并增加到数组中
                    temp=Factory.getCarInstance().add(c1,temp);
                    System.out.println("现在一共有"+temp+"辆车");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    for(int i=0;i<Data.dataArr.length;i++)
                    {
                        if(Data.dataArr[i]!=null)
                        {
                            System.out.println(Data.dataArr[i].getName());
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入的信息有误，请重新输入");

                    break;
            }
        }
    }
}

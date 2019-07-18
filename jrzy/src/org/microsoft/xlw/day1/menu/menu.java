package org.microsoft.xlw.day1.menu;

import org.microsoft.xlw.day1.data.DataBase;
import org.microsoft.xlw.day1.factory.Factory;
import org.microsoft.xlw.day1.vo.Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class menu {
    public static void menu() {

        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("======用户管理=======");
            System.out.println("1、增加用户");
            System.out.println("2、删除用户");
            System.out.println("3、用户列表");
            System.out.println("0、退出系统");
            System.out.println("请输入操作数：");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    String RegistTime=new String();

                    try{
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
                         Date date=new Date();
                         RegistTime=sdf.format(date);
                }catch (Exception e)
                {
                    System.out.println(e);
                }
                    Person s = new Person();
                    System.out.println("学号：");
                    s.setID(scan.next());
                    System.out.println("名称：");
                    s.setName(scan.next());
                    s.setRegidtTime(RegistTime);


                    if (Factory.Instant().add(s)) {
                        System.out.println("增加成功！");
                    } else {
                        System.out.println("增加失败！");
                    }

                    break;
                case 2:
                    Person a = new Person();
                    System.out.println("编号：");
                    a.setID(scan.next());
                    Factory.Instant().remove(a);
                    break;
                case 3:
                    sort();

                    for (Person datas : DataBase.data
                    ) {
                        System.out.println("编号：" + datas.getID()
                                + "\t姓名：" + datas.getName()+ "\t注册时间：" + datas.getRegistTime()
                        );
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("输入有误，请重新输入！");
            }

        }
    }
        public static void sort()
        {
           Person temp=new Person();
            for (int i = 0; i< DataBase.data.size(); i++)
            {
                for (int j=0;j<DataBase.data.size();j++)
                {
                    if(Double.parseDouble(DataBase.data.get(i).getID()) >Double.parseDouble(DataBase.data.get(j).getID()))
                    {
                        temp=DataBase.data.get(i);
                        DataBase.data.set(i,DataBase.data.get(j));
                        DataBase.data.set(j,temp);
                    }
                }

            }


        }
}

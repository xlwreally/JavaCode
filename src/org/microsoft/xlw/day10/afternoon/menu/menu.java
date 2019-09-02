package org.microsoft.xlw.day10.afternoon.menu;

import org.microsoft.xlw.day10.afternoon.data.DataBase;
import org.microsoft.xlw.day10.afternoon.factory.Factory;
import org.microsoft.xlw.day10.afternoon.vo.Goods;


import java.util.Scanner;

public class menu {
    public static void menu()
    {
        Scanner scan=new Scanner(System.in);


        while(true) {
            System.out.println("======商品管理=======");
            System.out.println("1、增加商品");
            System.out.println("2、删除商品");
            System.out.println("3、商品列表");
            System.out.println("0、退出系统");
            System.out.println("请输入操作数：");
            int num=scan.nextInt();
            switch(num)
            {
                case 1:
                    Goods s=new Goods();
                    System.out.println("编号：");
                    s.setId(scan.next());
                    System.out.println("名称：");
                    s.setName(scan.next());
                    System.out.println("类别：");
                    s.setCategary(scan.next());
                    System.out.println("单价：");
                    s.setPrice(scan.nextDouble());
                    System.out.println("描述：");
                    s.setDesc(scan.next());
                    if(Factory.GetInstance().add(s))
                    {
                        System.out.println("增加成功！");
                    }else
                    {
                        System.out.println("增加失败！");
                    }

                    break;
                case 2:
                    Goods r=new Goods();
                    System.out.println("编号：");
                    r.setId(scan.next());
                    Factory.GetInstance().remove(r);
                    break;
                case 3:
                        sort();
                    for (Goods datas: DataBase.data
                         ) {
                        System.out.println("编号："+ datas.getId()+""
                                + "\t名称："+datas.getName()+""
                                + "\t类别："+datas.getCategary()+""
                                + "\t单价："+datas.getPrice()+""
                                + "\t描述："+datas.getDesc());
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
        Goods temp=new Goods();
        for (int i=0;i<DataBase.data.size();i++)
        {
            for (int j=0;j<DataBase.data.size();j++)
            {
                if(Double.parseDouble(DataBase.data.get(i).getId()) >Double.parseDouble(DataBase.data.get(j).getId()))
                {
                    temp=DataBase.data.get(i);
                    DataBase.data.set(i,DataBase.data.get(j));
                    DataBase.data.set(j,temp);
                }
            }

        }
    }

}

package org.microsoft.xlw.menu;

import org.microsoft.xlw.data.DataBase;
import org.microsoft.xlw.factory.Factory;
import org.microsoft.xlw.vo.Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static org.microsoft.xlw.data.function.isInteger;
import static org.microsoft.xlw.data.function.sort;
public class menu {
    public static void menu() throws Exception {

        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("======用户管理系统=======");
            System.out.println("     1、增加用户");
            System.out.println("     2、修改用户");
            System.out.println("     3、删除用户");
            System.out.println("     4、用户列表");
            System.out.println("     0、退出系统");
            System.out.println("=======================");
            System.out.println("请输入操作数：");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    String RegistTime=new String();


                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
                         Date date=new Date();
                         RegistTime=sdf.format(date);

                    Person s = new Person();
                    System.out.println("学号：");
                    scan.nextLine();
                    while (true)
                    {
                        String ID=scan.nextLine();
                        if(isInteger(ID))
                        {
                            s.setID(ID);
                            break;
                        }
                        System.out.println("错误，学号必须为数字，请重新输入");
                    }
                    System.out.println("姓名：");
                    s.setName(scan.next());
                    System.out.println("请输入出生年月日，空格隔开");
                    s.setBirthday(scan.nextInt()+"年"+scan.nextInt()+"月"+scan.nextInt()+"日");
                    s.setRegidtTime(RegistTime);
                    if (Factory.Instant().add(s)) {
                        DataBase.save();
                        System.out.println("增加成功！");
                    } else {
                        System.out.println("增加失败！");
                    }

                    break;
                case 2:
                    Person a = new Person();
                    System.out.println("学号：");
                    scan.nextLine();
                    while (true)
                    {
                        String ID=scan.nextLine();
                        if(isInteger(ID))
                        {
                            a.setID(ID);
                            break;
                        }
                        System.out.println("错误，学号必须为数字，请重新输入");
                    }
                    System.out.println("姓名：");
                    a.setName(scan.next());
                    System.out.println("请输入出生年月日，空格隔开");
                    a.setBirthday(scan.nextInt()+"年"+scan.nextInt()+"月"+scan.nextInt()+"日");
                    if (Factory.Instant().change(a)) {
                        DataBase.save();
                        System.out.println("修改成功！");
                    } else {
                        System.out.println("修改失败！");
                    }
                    break;
                case 3:
                    Person c = new Person();
                    System.out.println("学号：");
                    scan.nextLine();
                    while (true)
                    {
                        String ID=scan.nextLine();
                        if(isInteger(ID))
                        {
                             c.setID(ID);
                            break;
                        }
                        System.out.println("错误，学号必须为数字，请重新输入");
                    }
                    if(Factory.Instant().remove(c)) {
                        DataBase.save();
                        System.out.println("删除成功");
                    }
                    else System.out.println("删除失败");
                    break;
                case 4:
                    if (DataBase.data == null) {
                        break;
                    }
                    sort();
                    Factory.Instant().get();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("输入有误，请重新输入！");
            }

        }
    }






}

package org.microsoft.xlw.dao.impl;


import org.microsoft.xlw.dao.PersonDao;
import org.microsoft.xlw.data.DataBase;
import org.microsoft.xlw.vo.Person;

import java.util.ListIterator;

public class PersonImpl  implements PersonDao {

    @Override
    public Boolean add(Object a) {


        DataBase.data.add((Person)a);
        return true;
    }

    @Override
    public Boolean remove(Object a) {
        Person s=new Person();
        s=(Person) a;
        for (int i=0;i<DataBase.data.size();i++)
        {
            if(DataBase.data.get(i).getID().equals(s.getID()))
            {
                DataBase.data.remove(i);
                return true;
            }
        }
        return false;

    }

    @Override
    public Boolean change(Object a) {

        Person s=new Person();
        s=(Person) a;
        for (int i=0;i<DataBase.data.size();i++)
        {
            if(DataBase.data.get(i).getID().equals(s.getID()))
            {
                DataBase.data.get(i).setName(s.getName());
                DataBase.data.get(i).setBirthday(s.getBirthday());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get() {
        ListIterator<Person> lit=DataBase.data.listIterator();
        while (lit.hasNext()){
            Person datas=lit.next();
            System.out.println("编号：" + datas.getID()
                    + "\t姓名：" + datas.getName()+ "\t生日：" + datas.getBirthday()+"\t注册时间：" + datas.getRegistTime());
        }

        return null;

    }
}

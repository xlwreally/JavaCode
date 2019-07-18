package org.microsoft.xlw.day1.dao.impl;

import org.microsoft.xlw.day1.dao.PersonDao;
import org.microsoft.xlw.day1.data.DataBase;
import org.microsoft.xlw.day1.vo.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        return null;
    }

    @Override
    public Object get(Object a) {

                return DataBase.data;

    }
}

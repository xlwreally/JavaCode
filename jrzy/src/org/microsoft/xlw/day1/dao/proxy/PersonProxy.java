package org.microsoft.xlw.day1.dao.proxy;

import org.microsoft.xlw.day1.dao.PersonDao;
import org.microsoft.xlw.day1.dao.impl.PersonImpl;
import org.microsoft.xlw.day1.vo.Person;

public class PersonProxy implements PersonDao {
    private PersonImpl dao=new PersonImpl();
    @Override
    public Boolean add(Object a) {

        return this.dao.add(a);
    }

    @Override
    public Boolean remove(Object a) {

        return this.dao.remove(a);
    }

    @Override
    public Boolean change(Object a) {
        return null;
    }

    @Override
    public Object get(Object a) {
        return this.dao.change(a);
    }
}

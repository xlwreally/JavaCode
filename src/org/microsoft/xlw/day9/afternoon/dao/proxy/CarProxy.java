package org.microsoft.xlw.day9.afternoon.dao.proxy;

import org.microsoft.xlw.day9.afternoon.dao.IcarDao;
import org.microsoft.xlw.day9.afternoon.vo.Car;
import org.microsoft.xlw.day9.afternoon.vo.impl.CarImpl;

public class CarProxy implements IcarDao {
    private CarImpl dao;
    private int temp;

    public CarProxy()
    {
        this.dao=new CarImpl();
    }
    public int add(Car a,int temp) {
        return  this.dao.add(a,temp);
    }


    @Override
    public Car[] findAll() {
        return new Car[0];
    }

    @Override
    public Car findId() {
        return null;
    }

    @Override
    public boolean remove(Car a) {
        return false;
    }

    @Override
    public boolean updata(Car a) {
        return false;
    }
}

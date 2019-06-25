package org.microsoft.xlw.day9.afternoon.vo.impl;

import org.microsoft.xlw.day9.afternoon.dao.IcarDao;
import org.microsoft.xlw.day9.afternoon.data.Data;
import org.microsoft.xlw.day9.afternoon.vo.Car;


public class CarImpl implements IcarDao {
    private int temp=0;

    public int add(Car a,int temp) {

        if(temp< Data.dataArr.length)
        {
            Data.dataArr[temp]=a;
            temp++;
            return temp;
        }
        return -1;
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

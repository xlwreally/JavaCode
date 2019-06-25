package org.microsoft.xlw.day9.afternoon.dao;


import org.microsoft.xlw.day9.afternoon.vo.Car;

public interface IcarDao  {

    public int add(Car a,int temp);
    public Car[] findAll();
    public Car findId();
    public boolean remove(Car a);
    public boolean updata(Car a);
}

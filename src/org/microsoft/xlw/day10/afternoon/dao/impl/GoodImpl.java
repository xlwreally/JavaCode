package org.microsoft.xlw.day10.afternoon.dao.impl;

import org.microsoft.xlw.day10.afternoon.dao.IGoodsDao;
import org.microsoft.xlw.day10.afternoon.data.DataBase;
import org.microsoft.xlw.day10.afternoon.vo.Goods;

public class GoodImpl implements IGoodsDao {
    @Override
    public boolean add(Goods vo) {
        DataBase.data.add(vo);
        return true;
    }

    @Override
    public boolean remove(Goods vo) {
        for (int i=0;i<DataBase.data.size();i++)
        {
            if(DataBase.data.get(i).getId().equals(vo.getId()))
            {
                DataBase.data.remove(i);
            }
        }
        return false;
    }
}

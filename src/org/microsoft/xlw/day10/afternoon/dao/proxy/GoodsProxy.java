package org.microsoft.xlw.day10.afternoon.dao.proxy;

import org.microsoft.xlw.day10.afternoon.dao.IGoodsDao;
import org.microsoft.xlw.day10.afternoon.dao.impl.GoodImpl;
import org.microsoft.xlw.day10.afternoon.vo.Goods;

public class GoodsProxy implements IGoodsDao {
    private GoodImpl dao=new GoodImpl();

    @Override
    public boolean add(Goods vo) {
        return this.dao.add(vo);
    }

    @Override
    public boolean remove(Goods vo) {
        return this.dao.remove(vo);
    }
}

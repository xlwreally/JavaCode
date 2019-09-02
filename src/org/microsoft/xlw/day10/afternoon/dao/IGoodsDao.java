package org.microsoft.xlw.day10.afternoon.dao;

import org.microsoft.xlw.day10.afternoon.vo.Goods;

public interface IGoodsDao {
    public boolean add(Goods vo);
    public boolean remove(Goods vo);
}

package org.microsoft.xlw.day10.afternoon.factory;

import org.microsoft.xlw.day10.afternoon.dao.IGoodsDao;
import org.microsoft.xlw.day10.afternoon.dao.proxy.GoodsProxy;

public class Factory {
    public static IGoodsDao GetInstance()
    {
        return new GoodsProxy();
    }
}

package org.microsoft.xlw.day10.afternoon.factory;

import org.microsoft.xlw.day10.afternoon.dao.IGoodsDao;
import org.microsoft.xlw.day10.afternoon.dao.proxy.GoodsProxy;
import sun.security.jca.GetInstance;

public class Factory {
    public static IGoodsDao GetInstance()
    {
        return new GoodsProxy();
    }
}

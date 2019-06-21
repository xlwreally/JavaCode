package org.microsoft.xlw.day9.afternoon.factory;

import org.microsoft.xlw.day9.afternoon.dao.proxy.CarProxy;

public class Factory {
public static CarProxy getCarInstance()
{
    return new CarProxy();
}
}

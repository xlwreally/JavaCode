package org.microsoft.xlw.day9.pox;

public class factory {
    public  static internet getNetworkInstance(boolean s)
    {
        if(s)return new proxy();
        return new normal();
    }
}

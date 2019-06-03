package org.microsoft.xlw.day7;

public class Extend  extends father{
    public Extend(String sjb) {
        super(sjb);
    }
    public  void print()
    {
        System.out.println(getSjb());
    }
}

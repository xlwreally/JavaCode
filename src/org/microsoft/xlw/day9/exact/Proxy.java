package org.microsoft.xlw.day9.exact;

public class Proxy implements inter{
    private Phoneimpl sd;

    public Proxy() {
        this.sd=new Phoneimpl();
    }

    @Override
    public void setall() {
        sd.setall();
    }

    @Override
    public void printall() {
        sd.printall();
    }
}

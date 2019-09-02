package org.microsoft.xlw.day9.pox;

public class proxy implements internet{

    private normal network;
    public proxy()
    {
        this.network=new normal();
    }

    public void brower() {
        System.out.println("启动ShadowsocksR");
        this.network.brower();
    }
}

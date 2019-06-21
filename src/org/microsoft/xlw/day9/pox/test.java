package org.microsoft.xlw.day9.pox;

public class test {
    public static void main(String[] args) {
        System.out.println("----没开代理----");
        factory.getNetworkInstance(false).brower();
        System.out.println("----开了代理----");
        factory.getNetworkInstance(true).brower();
    }
}

package org.microsoft.xlw.day3.vo;

public class Phone {
   public String model;
   public String type;
   public double verson;
   public String cpu;
   public String ram;
   public String rom;
   private String seriesnumber;

    public int display()
        {
        System.out.println("品牌"+model+"\t型号"+type+"\t安卓版本"+verson+"\t处理器"+cpu+"\t内存"+rom+"\t运存"+ram);
        return 0;
    }

    public String getSeriesnumber() {
        return seriesnumber;
    }

    public void setSeriesnumber(String seriesnumber) {
        this.seriesnumber = seriesnumber;
    }
}

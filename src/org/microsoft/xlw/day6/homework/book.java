package org.microsoft.xlw.day6.homework;



public class book {
    private String name;
    private static int code=0;
    private Double price;

    public String getName() {
        return name;
    }

    public book(String name) {
        this.name = name;
        code++;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  int getCode() {
        return code;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public  void print(int i) {
        System.out.println("书名:"+name+"编号:"+i);
    }



}

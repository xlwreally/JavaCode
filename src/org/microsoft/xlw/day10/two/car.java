package org.microsoft.xlw.day10.two;

public class car {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj instanceof car)
        {
            car c=(car)obj;
            if (c.getName().equals(this.name)&&c.getPrice().equals(this.price))return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.price+"||"+this.name;
    }
}

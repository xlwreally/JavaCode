package org.microsoft.xlw.day3.vo;

public class Cuboid {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x>0)
        this.x = x;
        else
        {
            System.out.println("erro");
            System.exit(6666);
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {

        if(y>0)
            this.y = y;
        else
        {
            System.out.println("erro");
            System.exit(666);
        }
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        if(z>0)
            this.z = z;
        else
        {
            System.out.println("erro");
            System.exit(666);
        }
    }
    public void print()
    {
        System.out.println("体积为："+x*y*z+"\t表面积为："+2*(x*y+y*z+z*x));
    }
}

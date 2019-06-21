package org.microsoft.xlw.day8.cilcle;

public class cilcle implements dia{
    private double a;

    private String color;

    public cilcle(double a, String color) {
        this.a = a;
        this.color = color;
    }

    public void color()
    {
        System.out.println(color);
    }

    public double area() {
        return a*a*3.1415926;
    }


    public double perimeter() {
        return a*2*3.1415926;
    }
}

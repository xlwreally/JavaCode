package org.microsoft.xlw.day8.cilcle;

public class rectrangle implements dia{
    private double a;
    private double b;
    private String color;

    public rectrangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public void color()
    {
        System.out.println(color);
    }
    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
}


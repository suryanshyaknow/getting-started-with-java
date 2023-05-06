package com.sys.Shapes;

public class Rectangle extends Shape{

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getPerimeter() {
        int peri = 2 * (length + width);
        System.out.println("Perimeter of the said Rectangle is " + peri + " units.");
    }

    @Override
    public void getArea() {
        int area = length * width;
        System.out.println("Area of the said Rectangle is " + area + " square units.");
    }

}

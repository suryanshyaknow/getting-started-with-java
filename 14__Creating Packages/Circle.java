package com.sys.Shapes;

public class Circle extends Shape {

    protected int radii;

    public Circle(int radii) {
        this.radii = radii;
    }

    @Override
    public void getPerimeter() {
        double peri = 2 * Math.PI * radii;
        System.out.println("Perimeter of the said Circle is " + peri + " units.");
    }

    @Override
    public void getArea() {
        double area = Math.PI * radii * radii;
        System.out.println("Area of the said Circle is " + area + " square units.");
    }

}

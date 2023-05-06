package com.sys.Shapes;

public class Square extends Shape {

    protected int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void getPerimeter() {
        int peri = 4 * side;
        System.out.println("Perimeter of the said Square is " + peri + " units.");
    }

    @Override
    public void getArea() {
        int area = side * side;
        System.out.println("Area of the said Square is " + area + " square units.");
    }

}

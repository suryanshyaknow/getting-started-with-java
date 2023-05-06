package com.sys.Shapes;

public class Cylinder extends Shape {

    protected int radii;
    protected int height;

    public Cylinder(int radii, int height) {
        this.radii = radii;
        this.height = height;
    }

    @Override
    public void getPerimeter() {
        double peri = 2 * Math.PI * (radii + height);
        System.out.println("Perimeter of the said Cylinder is " + peri + " units.");
    }

    @Override
    public void getArea() {
        double area = 2 * Math.PI * radii * (height + radii);
        System.out.println("Total Surface Area of the said Cylinder is " + area + " square units.");
    }

    public void getCurvedSurfaceArea() {
        double area = 2 * Math.PI * radii * height;
        System.out.println("Curved Surface Area of the said Cylinder is " + area + " square units.");
    }
    
    public void getVolume() {
        double vol = Math.PI * radii * radii * height;
        System.out.println("VOlume of the said Cylinder is " + vol + " cubic units.");
    }

}

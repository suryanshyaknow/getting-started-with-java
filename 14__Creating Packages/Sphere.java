package com.sys.Shapes;

public class Sphere extends Shape {

    protected int radii;

    public Sphere(int radii) {
        this.radii = radii;
    }

    @Override
    public void getPerimeter() {
        System.out.println(
                "Since a sphere is a three-dimensional object, it does not have a perimeter in the traditional sense. Instead, it has a surface area and a volume. Try computing them.");
        return;
    }

    @Override
    public void getArea() {
        double area = 4 * Math.PI * radii * radii;
        System.out.println("Total Surface Area of the said Sphere is " + area + " square units.");
    }

    public void getVolume() {
        double vol = 4 / 3 * Math.PI * Math.pow(radii, 3);
        System.out.println("Volume of the said Sphere is " + vol + " cubic units.");
    }

}

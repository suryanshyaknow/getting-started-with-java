import com.sys.Shapes.Square;
import com.sys.Shapes.Rectangle;
import com.sys.Shapes.Circle;
import com.sys.Shapes.Sphere;
import com.sys.Shapes.Cylinder;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(26);
        square.getPerimeter();
        square.getArea();

        System.out.println();

        Rectangle rect = new Rectangle(26, 11);
        rect.getPerimeter();
        rect.getArea();

        System.out.println();

        Circle circle = new Circle(199);
        circle.getPerimeter();
        circle.getArea();

        System.out.println();

        Sphere sphere = new Sphere(72);
        sphere.getPerimeter();
        sphere.getArea();
        sphere.getVolume();

        System.out.println();

        Cylinder cyl = new Cylinder(15, 9);
        cyl.getPerimeter();
        cyl.getArea();
        cyl.getCurvedSurfaceArea();
        cyl.getVolume();
    }

}

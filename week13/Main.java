
import java.text.DecimalFormat;

//632115036 Wanatchaya Kaewwongwan
abstract class abstractClass {

    public abstract double getArea();

}

public class Main {
    private static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {

        double base = 12, height = 4;
        abstractClass triangle = new Triangle(base, height);
        System.out.println("The triangle base is: " + base);
        System.out.println("The height is: " + height);
        System.out.println("The area is: " + df.format(triangle.getArea()));
        System.out.println("=======================================================");

        double width = 13, length = 7;
        abstractClass rectangle = new Rectangle(width, length);
        System.out.println("The rectangle width is: " + width);
        System.out.println("The length is: " + length);
        System.out.println("The area is: " + df.format(rectangle.getArea()));
        System.out.println("=======================================================");

        double radius = 9;
        abstractClass circle = new Circle(radius);
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The area is: " + df.format(circle.getArea()));
        

    }
}

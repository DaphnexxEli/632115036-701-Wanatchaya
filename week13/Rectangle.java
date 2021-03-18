
//632115036 Wanatchaya Kaewwongwan
public class Rectangle extends abstractClass {
    private double width, length;

    public Rectangle() {
        System.out.println("+THE RECTANGLE");
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        System.out.println("+THE RECTANGLE");
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}

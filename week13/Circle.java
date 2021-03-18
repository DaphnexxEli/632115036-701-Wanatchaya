
//632115036 Wanatchaya Kaewwongwan
public class Circle extends abstractClass {

    private double radius;
    final double pi = Math.PI;

    public Circle() {
        System.out.println("+THE CIRCLE");
        this.radius = 1;
    }

    public Circle(double radius) {
        System.out.println("+THE CIRCLE");
        this.radius = radius;
    }

    public double getArea() {
        return (pi * Math.pow(radius, 2));
    }

}
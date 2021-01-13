
package week5;
//632115036 Wanatchaya Kaewwongwan

public class MainAppII {
    public static void main(String[] args) {

        Circle circle1 = new Circle(0.0, 0.0, 2);
        System.out.println("Area of cir1 = " + circle1.findArea());
        System.out.println("Circumferrence of cir1 = " + circle1.findCircumfenrence());

        Circle circle2 = new Circle(1.0, 2.0, 3);
        System.out.println("Area of cir2 = " + circle2.findArea());
        System.out.println("Circumferrence of cir2 = " + circle2.findCircumfenrence());

        Circle circle3 = new Circle(3.0, 5.0, 1);
        System.out.println("Area of cir3 = " + circle3.findArea());
        System.out.println("Circumferrence of cir3 = " + circle3.findCircumfenrence());

        Circle circle4 = new Circle(-1.0, -1.0, 0);
        System.out.println("Area of cir4 = " + circle4.findArea());
        System.out.println("Circumferrence of cir4 = " + circle4.findCircumfenrence());

        System.out.println("Is circle 1 intersec circle 2: " + circle1.checkIntersect(circle2));
        System.out.println("Is circle 1 intersec circle 3: " + circle1.checkIntersect(circle3));

    }
}

class Circle {

    private double x;
    private double y;
    private double radius;
    private double Area;
    private double Circumfenrence;

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius < 0 ? 0 : radius;
    }

    public double findArea() {
        Area = Math.PI * Math.pow(radius, 2);
        return Area;
    }

    public double findCircumfenrence() {
        Circumfenrence = 2 * Math.PI * radius;
        return Circumfenrence;
    }

    public boolean checkIntersect(Circle c) {
        double d = Math.sqrt(Math.pow((this.x - c.x), 2) + (Math.pow((this.y - c.y), 2)));
        boolean a = false;
        return a = d < (this.radius + c.radius) ? true : false;
    }

}

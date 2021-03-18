
//632115036 Wanatchaya Kaewwongwan
public class Triangle extends abstractClass {
    private double base, height; 
    public Triangle() {
        System.out.println("+THE TRIANGLE");
        this.base = 1;
        this.height = 1;
    }
    public Triangle(double base, double height) {
        System.out.println("+THE TRIANGLE");
        this.base = base;
        this.height = height;
    }
    
    public double getArea() {
        return 0.5* base * height;
    }
    
}
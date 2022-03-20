package array.finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.14;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return r * r * PI;
    }

    public static void main(String[] args) {
        CircleCalculator cc = new CircleCalculator();
        System.out.println(cc.calculatePerimeter(30.0));
        System.out.println(cc.calculateArea(30.0));
    }
}

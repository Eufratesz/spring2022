package array.finalmodifier;

public class CylinderCalculatorBasedOnCircle {


    CircleCalculator cc = new CircleCalculator();

    public double calculateVolume(double r, double h) {
        return cc.calculateArea(r) * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return 2 * cc.calculateArea(r) + cc.calculatePerimeter(r) * h;
    }

    public static void main(String[] args) {
        CylinderCalculatorBasedOnCircle ccbc = new CylinderCalculatorBasedOnCircle();
        System.out.println(ccbc.calculateVolume(10.0, 10.0));
        System.out.println(ccbc.calculateSurfaceArea(10.0, 10.0));
    }
}

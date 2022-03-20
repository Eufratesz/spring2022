package array.finalmodifier;


public class CylinderCalculator {

    public double calculateVolume(double r, double h) {
        return r * r * CircleCalculator.PI * h;
    }

    public double calculateSurfateArea(double r, double h) {
        return (2 * r * r * CircleCalculator.PI) + (2 * r * CircleCalculator.PI * h);
    }

    public static void main(String[] args) {
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(10.0, 10.0));
        System.out.println(cylinderCalculator.calculateSurfateArea(10.0, 10.0));
    }
}

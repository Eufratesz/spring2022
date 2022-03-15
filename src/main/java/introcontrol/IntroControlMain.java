package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(1));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(12));

        System.out.println(introControl.describeNumber(-1));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(11));

        System.out.println(introControl.greetingToJoe("Jim"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(1_000_000));
        System.out.println(introControl.calculateBonus(1_000_300));
        System.out.println(introControl.calculateBonus(100_000));

        introControl.printNumbers(10);
        introControl.printNumbersBetween(1, 8);

        introControl.printNumbersBetweenAnyDirection(10, 6);
        introControl.printNumbersBetweenAnyDirection(4, 10);

        introControl.printOddNumbers(11);
        introControl.printOddNumbers2(11);

        System.out.println(introControl.calculateConsumption(2111, 345));
        System.out.println(introControl.calculateConsumption(111, 345));
    }
}

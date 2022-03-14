package stringtype.linebreak;

import java.util.Scanner;

public class Car {


    public String getBrandAndTypeInSeparateLines(String brand, String type){
        return brand + "\n" + type + "\n";
    }


    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az autó márkáját!");
        String brand = scanner.nextLine();
        System.out.println("Adja meg az autó típusát!");
        String type = scanner.nextLine();

        System.out.println(car.getBrandAndTypeInSeparateLines(brand, type));
    }
}

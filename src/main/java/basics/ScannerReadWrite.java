package basics;

import java.util.Scanner;

public class ScannerReadWrite {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Year of birth: " + yearOfBirth);
        int age = 2022 - yearOfBirth;
        System.out.println("Age: " + age);

        System.out.println("What's your favourite number?");
        int number = scanner.nextInt();
        System.out.println("What's your favourite season?");
        scanner.nextLine();
        String season = scanner.nextLine();
        System.out.println("Favourite number: " + number);
        System.out.println("Faourite season: " + season);
    }
}

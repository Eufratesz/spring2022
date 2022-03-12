package Basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("First number?");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Second number?");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);
    }
}

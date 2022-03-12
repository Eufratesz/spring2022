package basics;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is your email address?");
        String email = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

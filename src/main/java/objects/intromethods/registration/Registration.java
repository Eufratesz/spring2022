package objects.intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String surname, String firstname) {
        return firstname + " " + surname;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your surname?");
        String surname = scanner.nextLine();
        System.out.println("What's your firstname?");
        String firstname = scanner.nextLine();

        System.out.println("When were you born?");
        System.out.println("Year?");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Month?");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Day?");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your email?");
        String email = scanner.nextLine();

        String fullName = registration.getFullName(surname, firstname);
        LocalDate dateOfBirth = registration.getDateOfBirth(year, month, day);

        Person person = new Person(fullName, dateOfBirth, email);
        System.out.println("You're successfully registered! Your data: ");
        System.out.println(person);


    }
}

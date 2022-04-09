package typesoperators.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Application for the exam. Please give your personal data.");
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Year of birth: ");
        String yearString = scanner.nextLine();
        int year = Integer.parseInt(yearString);

        System.out.println("Month of birth: ");
        String monthString = scanner.nextLine();
        int month = Integer.parseInt(monthString);


        System.out.println("Day of birth: ");
        String dayString = scanner.nextLine();
        int day = Integer.parseInt(dayString);

        LocalDate dateOfBirth = LocalDate.of(year,month, day);
        System.out.println("Your date of birth: " + dateOfBirth);


        System.out.println("Zip code: ");
        String zipCodeString = scanner.nextLine();
        int zipCode = Integer.parseInt(zipCodeString);


        System.out.println("Average of your grades: ");
        String averageString = scanner.nextLine();
        double average = Double.parseDouble(averageString);

        Exam exam = new Exam();
        Person person = new Person(name, dateOfBirth, zipCode, average);

        exam.addPerson(person);

        System.out.println(exam.getPersonList());




    }
}

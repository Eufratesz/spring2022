package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
/*
        Time time = new Time(2, 10, 20);
        System.out.println(time.getInMinutes());   //130
        System.out.println(time.getInSeconds());    //7820

        Time time2 = new Time(2, 20, 20);

        System.out.println(time.earlierThan(time2));  //true

        System.out.println(time.toString());
        System.out.println(time2.toString());
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("First time - hours:");
        int hours1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("First time - minutes:");
        int minutes1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("First time - seconds:");
        int seconds1 = scanner.nextInt();
        scanner.nextLine();

        Time time1 = new Time(hours1, minutes1, seconds1);
        System.out.println("First time: " + time1.toString());
        System.out.println("First time in minutes: " + time1.getInMinutes());

        System.out.println("Second time - hours:");
        int hours2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second time - minutes:");
        int minutes2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Second time - seconds:");
        int seconds2 = scanner.nextInt();
        scanner.nextLine();

        Time time2 = new Time(hours2, minutes2, seconds2);
        System.out.println("Second time: " + time2.toString());
        System.out.println("Seond time in seconds: " + time2.getInSeconds());

        System.out.println("Is first time earlier? " + time1.earlierThan(time2));


    }
}

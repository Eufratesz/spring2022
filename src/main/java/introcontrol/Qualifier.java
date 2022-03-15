package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number?");
        int number = scanner.nextInt();

        if(number == 100){
            System.out.println("Száz.");
        }
        if( number> 100){
            System.out.println("Nagyobb, mint száz");
        }
        if ( number < 100){
            System.out.println("Kisebb, mint száz");
        }

    }
}

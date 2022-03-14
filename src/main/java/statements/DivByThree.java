package statements;

import java.util.Scanner;

public class DivByThree {



    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("A number: ");
        int number = scanner.nextInt();
        System.out.println("Your number can be devided by 3? " + (number % 3 ==0 ? "yes" : "no"));


    }
}

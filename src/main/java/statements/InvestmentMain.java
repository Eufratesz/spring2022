package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege: ");
        int fund = scanner.nextInt();
        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);
        System.out.println("Tőke: " + investment.getFund());

        System.out.println("Hány napra számoljam a hozamot?");
        int days = scanner.nextInt();

        System.out.println("Hozam " + days + " napra: " + investment.getYield(days) + "Forint");

        System.out.println("Hány nap után veszi ki az összeget?");
        int daysClose = scanner.nextInt();
        Investment investment2 = new Investment(fund, daysClose);
        System.out.println("A kivett összeg " + daysClose + " nap után: " + investment2.close(daysClose));

        }
}

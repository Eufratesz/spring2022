package classstructuremethods;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("First account - Name: ");
        String owner1 = scanner.nextLine();

        System.out.println("First account - Account number: ");
        String accountNumber1 = scanner.nextLine();

        System.out.println("First account - Balance: ");
        int balance1 = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount1 = new BankAccount(accountNumber1, owner1, balance1);
        System.out.println(bankAccount1.getInfo());



        System.out.println("Second account - name:");
        String owner2 = scanner.nextLine();


        System.out.println("Second account - account number:");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Second account - balance:");
        int balance2= scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount2 = new BankAccount(accountNumber2, owner2, balance2);
        System.out.println(bankAccount2.getInfo());

        System.out.println("First account - amount to deposit:");
        int depositAmount = scanner.nextInt();
        scanner.nextLine();
        bankAccount1.deposit(depositAmount);
        System.out.println(bankAccount1.getInfo());

        System.out.println("Second account - amount to withdraw:");
        int withdrawAmount = scanner.nextInt();
        scanner.nextLine();
        bankAccount2.withdraw(withdrawAmount);
        System.out.println(bankAccount2.getInfo());

        System.out.println("how much to transfer from first to second account?");
        int transferAmount = scanner.nextInt();
        scanner.nextLine();
        bankAccount1.transfer(bankAccount2, transferAmount);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());










    }
}

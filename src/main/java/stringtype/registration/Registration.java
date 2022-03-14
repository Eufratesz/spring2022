package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

//        System.out.println("Adja meg a felhasználónevét!");
//        String username = scanner.nextLine();
//        System.out.println(validator.isValidUsername(username)? "érvényes felhasználónév" : "érvénytelen felhasználónév");
//
//        System.out.println("Adja meg a jelszavát!");
//        String password1 = scanner.nextLine();
//        System.out.println("Adja meg újra a jelszavát!");
//        String password2 = scanner.nextLine();
//        System.out.println(validator.isValidPassword(password1, password2) ? "érvényes jelszó" : "érvénytelen jelszó");

        System.out.println("Adja meg az email címét!");
        String email = scanner.nextLine();
        System.out.println(validator.isValidEmail(email) ? "érvényes email" : "érvénytelen email");


        // System.out.println(validator.isValidUsername(username) == true ? "érvényes felhasználónév" : "érvénytelen felhasználónév");


    }
}

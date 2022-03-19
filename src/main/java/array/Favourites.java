package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favoureteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kedvenc film?");
        String film = scanner.nextLine();
        System.out.println("Kedvenc színész?");
        String actor = scanner.nextLine();
        System.out.println("Kedvenc állat?");
        String animal = scanner.nextLine();

        favoureteThings.add(film);
        favoureteThings.add(actor);
        favoureteThings.add(animal);

        System.out.println(favoureteThings.size());
        System.out.println(favoureteThings);
    }
}

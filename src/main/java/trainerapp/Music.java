package trainerapp;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Favourite band?");
        song.band = scanner.nextLine();
        System.out.println("Favourite song?");
        song.title = scanner.nextLine();
        System.out.println("How long is it (minutes)?");
        song.length = scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");
    }
}

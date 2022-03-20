package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Adam", "Bob", "Cecil", "David", "Eve", "Fred", "Greg",
                "Hedvig", "Iris", "James"));

        Random random = new Random();
        int randomnumberFirst = random.nextInt(5);
        int randomnumberSecond = random.nextInt(5) + 5;
        int randomOneToTen = random.nextInt(10)+1;

        RandomDraw randomDraw = new RandomDraw();

        System.out.println((randomnumberFirst + 1 ) + ": " + names.get(randomnumberFirst));
        System.out.println((randomnumberSecond + 1) + ": " + names.get(randomnumberSecond));
        System.out.println(randomOneToTen);

    }

}

package array;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {
        Island island = new Island();

        List<String>importantThings = Arrays.asList("Bible", "water", "food");
        System.out.println(importantThings);

        importantThings.set(2, "knife");
        System.out.println(importantThings);
    }
}

package array;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("csirkemell");
        foodList.add("hal");
        foodList.add("borsó");
        foodList.add("zöldbab");
        foodList.add("brokkoli");

        System.out.println(foodList);
        System.out.println(foodList.size());

        foodList.remove("zöldbab");
        foodList.remove(3);
        System.out.println(foodList);
        System.out.println(foodList.size());

    }
}

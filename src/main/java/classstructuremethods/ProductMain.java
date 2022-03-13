package classstructuremethods;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Product name: ");
        String name = scanner.nextLine();

        System.out.println("Product price: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);
        System.out.println(product.getName() + ": " + product.getPrice());

        product.increasePrice(10000);
        System.out.println("Product: " + product.getName() + ", increased price: " + product.getPrice());

        product.decreasePrice(50000);
        System.out.println("Product: "+ product.getName() + ", decreased price: " + product.getPrice());


    }
}

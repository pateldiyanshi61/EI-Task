package main;

import adapter.Productsinstore;

import java.util.Scanner;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Productsinstore productsinstore = new Productsinstore();

        while (true) {
            System.out.print("Enter product type (or 'exit' to quit): ");
            String producttype = scanner.nextLine();

            if (producttype.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter item name: ");
            String itemname = scanner.nextLine();

            productsinstore.getproducts(producttype, itemname);
        }

        scanner.close();
    }
}

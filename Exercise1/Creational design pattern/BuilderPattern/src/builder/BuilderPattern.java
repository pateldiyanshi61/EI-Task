package builder;

import model.ClothingBuilder;
import model.Clothes;

import java.util.Scanner;

public class BuilderPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter material: ");
        String material = scanner.nextLine();

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        // Build Clothes object with user inputs
        Clothes c = new ClothingBuilder()
                        .setMaterial(material)
                        .setSize(size)
                        .setPrice(price)
                        .setType(type)
                        .setColor(color)
                        .setBrand(brand)
                        .build();

        // Output the Clothes object
        System.out.println("\nCreated Clothes object:");
        System.out.println(c);

        scanner.close();
    }    
}

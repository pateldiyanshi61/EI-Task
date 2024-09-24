package main;

import cake.Cake;
import cake.ChocolateCake;
import cake.StrawberryCake;
import cake.ChocotoppingDecorator;

import java.util.Scanner;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a cake type (1: Strawberry, 2: Chocolate, 0: Exit): ");
            int cakeChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            Cake cake = null;

            switch (cakeChoice) {
                case 1:
                    cake = new StrawberryCake();
                    break;
                case 2:
                    cake = new ChocolateCake();
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("Add chocolate topping? (yes/no): ");
            String toppingChoice = scanner.nextLine();

            if (toppingChoice.equalsIgnoreCase("yes")) {
                cake = new ChocotoppingDecorator(cake);
            }

            System.out.println("Your cake: ");
            cake.bake();
            System.out.println();
        }
    }
}

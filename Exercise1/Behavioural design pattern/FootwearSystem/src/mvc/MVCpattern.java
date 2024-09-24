package mvc;

import controller.FootwearController;
import model.Footwear;
import view.FootwearView;
import utils.LoggerUtility;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        try {
            // Initialize the footwear model with dynamic input
            Footwear model = initializeFootwear();
            // Create a view to display footwear details
            FootwearView view = new FootwearView();
            // Create a controller to manage the interaction between the model and view
            FootwearController controller = new FootwearController(model, view);

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n1: Show Footwear Details\n2: Update Brand\n3: Update Type\n4: Exit");
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        controller.updateView();
                        LoggerUtility.logInfo("Displayed footwear details.");
                        break;
                    case "2":
                        System.out.print("Enter new brand: ");
                        String newBrand = scanner.nextLine();
                        controller.setFootwearBrand(newBrand);
                        LoggerUtility.logInfo("Updated brand to: " + newBrand);
                        break;
                    case "3":
                        System.out.print("Enter new type: ");
                        String newType = scanner.nextLine();
                        controller.setFootwearType(newType);
                        LoggerUtility.logInfo("Updated type to: " + newType);
                        break;
                    case "4":
                        running = false;
                        LoggerUtility.logInfo("Exiting the application.");
                        break;
                    default:
                        LoggerUtility.logWarning("Invalid choice entered.");
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }

            scanner.close();
        } catch (Exception e) {
            LoggerUtility.logError("An error occurred during the application execution.", e);
        }
    }

    private static Footwear initializeFootwear() {
        Scanner scanner = new Scanner(System.in);
        Footwear footwear = new Footwear();

        System.out.print("Enter initial brand for the footwear: ");
        String brand = scanner.nextLine();
        footwear.setBrand(brand);

        System.out.print("Enter initial type for the footwear: ");
        String type = scanner.nextLine();
        footwear.setType(type);

        return footwear;
    }
}

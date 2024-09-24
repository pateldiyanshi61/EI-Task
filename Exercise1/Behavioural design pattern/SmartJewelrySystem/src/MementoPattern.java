import java.util.Scanner;

public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out
                    .println("\n1: Add Jewelry\n2: Save Jewelry\n3: Retrieve Jewelry\n4: View Saved Jewelry\n5: Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter Jewelry: ");
                        String jewelry = scanner.nextLine();
                        originator.setJewelry(jewelry);
                        LoggerUtility.logInfo("Jewelry set to: " + jewelry);
                        break;
                    case "2":
                        careTaker.add(originator.saveJewelryToMemento());
                        LoggerUtility.logInfo("Jewelry saved to Memento.");
                        break;
                    case "3":
                        System.out.print("Enter index to retrieve: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        originator.getJewelryFromMemento(careTaker.get(index));
                        LoggerUtility.logInfo("Retrieved Jewelry: " + originator.getJewelry());
                        break;
                    case "4":
                        for (int i = 0; i < careTaker.getMementoList().size(); i++) {
                            System.out.println("Memento " + i + ": " + careTaker.get(i).getJewelry());
                        }
                        break;
                    case "5":
                        exit = true;
                        LoggerUtility.logInfo("Exiting the application.");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        LoggerUtility.logWarning("Invalid choice entered.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                LoggerUtility.logWarning("Invalid number format.");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                LoggerUtility.logError("Custom exception occurred.", e);
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
                LoggerUtility.logError("Unexpected exception occurred.", e);
            }
        }
        scanner.close();
    }
}

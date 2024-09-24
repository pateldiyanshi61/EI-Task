import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Device");
            System.out.println("2. Remove Device");
            System.out.println("3. Turn On Device");
            System.out.println("4. Turn Off Device");
            System.out.println("5. Report Status");
            System.out.println("6. Set Thermostat Temperature");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter device ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter device type (light/thermostat/door): ");
                    String type = scanner.nextLine();
                    try {
                        Device device = DeviceFactory.createDevice(id, type);
                        hub.addDevice(device);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter device ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    hub.removeDevice(removeId);
                    break;

                case 3:
                    System.out.print("Enter device ID to turn on: ");
                    int turnOnId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    hub.turnOnDevice(turnOnId);
                    break;

                case 4:
                    System.out.print("Enter device ID to turn off: ");
                    int turnOffId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    hub.turnOffDevice(turnOffId);
                    break;

                case 5:
                    hub.reportStatus();
                    break;

                case 6:
                    System.out.print("Enter thermostat ID to set temperature: ");
                    int thermoId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new temperature: ");
                    int temperature = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Device device = hub.getDeviceById(thermoId);
                    if (device instanceof Thermostat) {
                        ((Thermostat) device).setTemperature(temperature);
                    } else {
                        System.out.println("No thermostat found with ID: " + thermoId);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

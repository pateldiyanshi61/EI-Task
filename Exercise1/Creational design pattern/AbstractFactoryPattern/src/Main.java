import factory.AbstractFactory;
import factory.FactoryProducer;
import model.Restaurant;
import model.Rating;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Restaurant Type
        System.out.println("Enter type of factory to use (restaurant/rating):");
        String factoryType = scanner.nextLine();

        AbstractFactory factory = FactoryProducer.getFactory(factoryType);

        if (factory == null) {
            System.out.println("Invalid factory type.");
            return;
        }

        // Process Restaurant
        if (factoryType.equalsIgnoreCase("restaurant")) {
            System.out.println("Enter restaurant type (FineDining, FoodHall, FoodTruck, FamilyStyle, CruiseLine):");
            String restaurantType = scanner.nextLine();
            Restaurant restaurant = factory.getRestaurant(restaurantType);
            if (restaurant != null) {
                restaurant.resType();
            } else {
                System.out.println("Invalid restaurant type.");
            }
        }

        // Process Rating
        else if (factoryType.equalsIgnoreCase("rating")) {
            System.out.println("Enter rating type (ThreeStar, FiveStar, SevenStar):");
            String ratingType = scanner.nextLine();
            Rating rating = factory.getRating(ratingType);
            if (rating != null) {
                rating.rateType();
            } else {
                System.out.println("Invalid rating type.");
            }
        }

        scanner.close();
    }
}

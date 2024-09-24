package factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("restaurant")) {
            return new RestaurantFactory();
        } else if (choice.equalsIgnoreCase("rating")) {
            return new RatingFactory();
        }
        return null;
    }
}

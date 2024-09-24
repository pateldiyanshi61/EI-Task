package factory;

import model.*;

public class RestaurantFactory extends AbstractFactory {

    @Override
    public Restaurant getRestaurant(String restaurantType) {
        if (restaurantType == null) {
            return null;
        }
        switch (restaurantType.toLowerCase()) {
            case "finedining":
                return new FineDining();
            case "foodhall":
                return new FoodHall();
            case "foodtruck":
                return new FoodTruck();
            case "familystyle":
                return new FamilyStyle();
            case "cruiseline":
                return new CruiseLine();
            default:
                return null;
        }
    }

    @Override
    public Rating getRating(String ratingType) {
        return null;
    }
}

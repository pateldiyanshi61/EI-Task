package factory;

import model.Restaurant;
import model.Rating;

public abstract class AbstractFactory {
    public abstract Restaurant getRestaurant(String restaurantType);

    public abstract Rating getRating(String ratingType);
}

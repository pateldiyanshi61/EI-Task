package factory;

import model.*;

public class RatingFactory extends AbstractFactory {

    @Override
    public Restaurant getRestaurant(String restaurantType) {
        return null;
    }

    @Override
    public Rating getRating(String ratingType) {
        if (ratingType == null) {
            return null;
        }
        switch (ratingType.toLowerCase()) {
            case "threestar":
                return new ThreeStar();
            case "fivestar":
                return new FiveStar();
            case "sevenstar":
                return new SevenStar();
            default:
                return null;
        }
    }
}

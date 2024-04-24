package swiggyapplatest;

import java.util.Optional;

public class RestaurantService {
    public static Optional<Restaurant> findRestaurant(Swiggy swiggy, String restaurantName) {
        return swiggy.getRestaurant(restaurantName);
    }
}


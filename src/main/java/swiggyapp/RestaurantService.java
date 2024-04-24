package swiggyapp;

import java.util.Optional;
import java.util.function.Supplier;

class RestaurantService {
     Supplier<Optional<Restaurant>> findRestaurant(Swiggy swiggy, String restaurantName) {
        return swiggy.getRestaurantSupplier(restaurantName);
    }
}

package swiggyapplatest;
import java.util.function.Supplier;
public class RestaurantService {
    public  Supplier<Restaurant> findRestaurant(Swiggy swiggy, String restaurantName) {
        return () -> {
            for (Restaurant restaurant : swiggy.getRestaurants()) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
        };
    }
}




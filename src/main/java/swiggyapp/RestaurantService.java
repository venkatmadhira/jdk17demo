package swiggyapp;
public class RestaurantService {
        public static Restaurant findRestaurant(Swiggy swiggy, String restaurantName) {
            return swiggy.getRestaurant(restaurantName);
        }
    }


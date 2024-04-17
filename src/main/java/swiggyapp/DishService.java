package swiggyapp;

public class DishService {
        public static Dish findDish(Restaurant restaurant, String dishName) {
            if (restaurant != null) {
                return restaurant.getDish(dishName);
            } else {
                return null;
            }
        }
    }

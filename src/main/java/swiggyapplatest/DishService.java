package swiggyapplatest;

import java.util.Optional;

public class DishService {
    public static Optional<Dish> findDish(Restaurant restaurant, String dishName) {
        if (restaurant != null) {
            return restaurant.getMenu().stream()
                    .filter(dish -> dish.getName().equalsIgnoreCase(dishName))
                    .findFirst();
        } else {
            return Optional.empty();
        }
    }
}


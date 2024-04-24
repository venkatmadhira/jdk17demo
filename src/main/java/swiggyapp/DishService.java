package swiggyapp;

import java.util.Optional;
import java.util.function.Supplier;

class DishService {
     Supplier<Optional<Dish>> findDish(Restaurant restaurant, String dishName) {
        if (restaurant != null) {
            return restaurant.getDishSupplier(dishName);
        } else {
            return () -> Optional.empty();
        }
    }
}

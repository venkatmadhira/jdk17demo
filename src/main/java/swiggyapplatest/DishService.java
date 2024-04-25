package swiggyapplatest;
import java.util.function.Predicate;

public class DishService {
    public Dish findDish(Restaurant restaurant, String dishName) {
        if (restaurant != null) {
            Predicate<Dish> dishPredicate = dish -> dish.getName().equalsIgnoreCase(dishName);
            return restaurant.getMenu().stream()
                    .filter(dishPredicate)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
}




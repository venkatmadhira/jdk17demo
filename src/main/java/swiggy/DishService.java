package swiggy;
import java.util.function.Function;
import java.util.function.Predicate;

public class DishService {
    public Function<Restaurant, Predicate<Dish>> findDishPredicate(String dishName) {
        return restaurant -> dish -> dish.getName().equalsIgnoreCase(dishName) && restaurant.getMenu().contains(dish);
    }
}

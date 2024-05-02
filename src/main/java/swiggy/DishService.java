package swiggy;
import java.util.function.Function;
import java.util.function.Predicate;

public class DishService {
    public Function<Restaurant, Predicate<Dish>> findDishPredicate(Restaurant restaurant1,String dishName) {
        return restaurant -> dish -> dish.getName().equalsIgnoreCase(dishName) && restaurant.getMenu().contains(dish);
    }
}

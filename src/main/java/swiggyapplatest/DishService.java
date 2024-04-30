package swiggyapplatest;
import java.util.function.Predicate;

public class DishService {
    public Dish findDish(Restaurant restaurant, String dishName) throws CheckedException {
        if (restaurant != null) {
            Predicate<Dish> dishPredicate = dish -> dish.name.equalsIgnoreCase(dishName);
            return restaurant.getMenu().stream()
                    .filter(dishPredicate)
                    .findFirst()
                    .orElse(null);
        }else{
            throw new CheckedException(ExceptionHandling.NO_DISH_FOUND.code, ExceptionHandling.NO_DISH_FOUND.message);
        }
    }
}




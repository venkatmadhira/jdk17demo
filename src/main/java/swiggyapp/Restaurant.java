package swiggyapp;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {

    public String name;
    public List<Dish> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addToMenu(Dish dish) {
        menu.add(dish);
    }

    public boolean dishAvail(String dishName) {
        for (Dish dish : menu) {
            if (dish.getName().equals(dishName)) {
                return true;
            }
        }
        return false;
    }

    public Dish getDish(String dishName) {
        for (Dish dish : menu) {
            if (dish.getName().equals(dishName)) {
                return dish;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

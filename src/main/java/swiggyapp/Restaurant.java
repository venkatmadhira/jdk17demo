package swiggyapp;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private Address address;
    private List<Dish> menu;
    private double rating;

    public Restaurant(String name, Address address) {
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
        this.rating = 0; // Initialize rating to 0
    }

    public void addToMenu(Dish dish) {
        menu.add(dish);
    }

    public boolean hasDish(String dishName) {
        for (Dish dish : menu) {
            if (dish.getName().equalsIgnoreCase(dishName)) {
                return true;
            }
        }
        return false;
    }

    public Dish getDish(String dishName) {
        for (Dish dish : menu) {
            if (dish.getName().equalsIgnoreCase(dishName)) {
                return dish;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

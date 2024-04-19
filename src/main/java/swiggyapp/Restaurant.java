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
        this.rating = 0;
    }
    public void addToMenu(Dish dish) {
        menu.add(dish);
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

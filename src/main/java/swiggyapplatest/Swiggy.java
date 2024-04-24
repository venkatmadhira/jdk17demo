package swiggyapplatest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Swiggy {
    public List<Restaurant> restaurants;

    public Swiggy() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public Optional<Restaurant> getRestaurant(String restaurantName) {
        return restaurants.stream()
                .filter(restaurant -> restaurant.getName().equalsIgnoreCase(restaurantName))
                .findFirst();
    }
}



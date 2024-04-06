package swiggyapp;

public class SwiggyService {

    public void swiggyService(){
    Swiggy swiggy = new Swiggy();

    Dish biryani = new Dish("Biryani", 160.00);
    Dish chicken65 = new Dish("Chicken65", 150.00);
    Dish rolls = new Dish("Rolls", 100.00);

    Restaurant restaurant1 = new Restaurant("Mehfil");
            restaurant1.addToMenu(biryani);
            restaurant1.addToMenu(chicken65);

    Restaurant restaurant2 = new Restaurant("Roll Zone");
            restaurant2.addToMenu(rolls);

            swiggy.addRestaurant(restaurant1);
            swiggy.addRestaurant(restaurant2);

    String restaurantName = "Mehfil";
    String dishName = "Biryani";

            if (swiggy.restaurant(restaurantName)) {
        Restaurant restaurant = swiggy.getRestaurant(restaurantName);
        if (restaurant.dishAvail(dishName)) {
            Dish dish = restaurant.getDish(dishName);
            System.out.println("Ordered " + dish.getName() + " from " + restaurant.getName() + " for Rs: " + dish.getPrice());
        } else {
            System.out.println("No, " + restaurant.getName() + " does not have " + dishName);
        }
    } else {
        System.out.println("No, " + restaurantName + " is not available on Swiggy.");
    }
}
}


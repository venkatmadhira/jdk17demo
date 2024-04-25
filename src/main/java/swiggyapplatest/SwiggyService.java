package swiggyapplatest;
public class SwiggyService {

    public void orderFood() {
        Swiggy swiggy = new Swiggy();
        RestaurantService restaurantService=new RestaurantService();
        DishService dishService=new DishService();

        Dish biryani = new Dish("Biryani", 150.00);
        Dish chicken65 = new Dish("Chicken65", 180.00);
        Dish mandi = new Dish("Mandi", 300.00);

        biryani.setRating(4.5);
        chicken65.setRating(4.2);
        mandi.setRating(4.8);

        Address address1 = new Address("Jntu", "Hyd", "500085");
        Restaurant restaurant1 = new Restaurant("Mehfil", address1);
        restaurant1.addToMenu(biryani);
        restaurant1.addToMenu(chicken65);
        restaurant1.setRating(4.3);

        Address address2 = new Address("Gachibowli", "Hyd", "500060");
        Restaurant restaurant2 = new Restaurant("Jail Mandi", address2);
        restaurant2.addToMenu(mandi);
        restaurant2.addToMenu(biryani);
        restaurant2.setRating(4.6);

        swiggy.addRestaurant(restaurant1);
        swiggy.addRestaurant(restaurant2);

        String restaurantName = "Jail Mandi";
        String[] dishNames = {"Mandi", "Biryani"};

        PaymentService paymentService = new PaymentService();
        LoginService loginService = new LoginService();

        String mobileNumber = "1234567890";
        int otp = 1234;
        boolean loginSuccessful = loginService.validateLogin(mobileNumber, otp);

        if (loginSuccessful) {
            System.out.println("Login Successful");
            Restaurant foundRestaurant = restaurantService.findRestaurant(swiggy, restaurantName).get();
            if (foundRestaurant != null) {
                Cart cart = new Cart();
                for (String dishName : dishNames) {
                    Dish orderedDish = dishService.findDish(foundRestaurant, dishName);
                    if (orderedDish != null) {
                        cart.addItem(orderedDish);
                        System.out.println("Ordered " + orderedDish.getName() + " from " + foundRestaurant.getName() +
                                " located at " + foundRestaurant.getAddress() +
                                " for Rs:" + orderedDish.getPrice() + "  , with Dish rating " + orderedDish.getRating()
                                + "  ,  with Restaurant rating: " + foundRestaurant.getRating());
                    } else {
                        System.out.println("Sorry, " + foundRestaurant.getName() + " does not have " + dishName);
                    }
                }
                System.out.println("Items added to cart: " + cart.getItems());
                System.out.println("Total Price: " + cart.getTotalPrice());
                paymentService.makePayment(cart.getTotalPrice(), "Credit Card");
            } else {
                System.out.println("Restaurant not found: " + restaurantName);
            }
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }

    public static void main(String[] args) {
        SwiggyService swiggyService = new SwiggyService();
        swiggyService.orderFood();
    }
}







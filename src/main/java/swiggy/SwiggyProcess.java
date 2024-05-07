package swiggy;

public class SwiggyProcess {

    public void process(RestaurantService restaurantService, DishService dishService, Swiggy swiggy) throws CheckedException {

        String restaurantName = "Jail Mandi";
        String[] dishNames = {"Mandi", "ChickenBiryani"};

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
                        cart.addItem.accept(orderedDish);
                        System.out.println("Ordered " + orderedDish.name + " from " + foundRestaurant.getName() +
                                " located at " + foundRestaurant.getAddress() +
                                " for Rs:" + orderedDish.price + "  , with Dish rating " + orderedDish.getRating()
                                + "  ,  with Restaurant rating: " + foundRestaurant.getRating());
                    } else {
                        throw new CheckedException(ExceptionHandling.NO_DISH_FOUND.code, ExceptionHandling.NO_DISH_FOUND.message);
                    }
                }
                System.out.println("Items added to cart: " + cart.getItems.get());
                System.out.println("Total Price: " + cart.getTotalPrice());
                paymentService.makePayment(cart.getTotalPrice(), "CreditCard");
            } else {
                throw new CheckedException(ExceptionHandling.NO_RESTAURANT_FOUND.code, ExceptionHandling.NO_RESTAURANT_FOUND.message);
            }
        } else {
            throw new CheckedException(ExceptionHandling.LOGIN_FAILED.code, ExceptionHandling.LOGIN_FAILED.message);
        }
    }
}



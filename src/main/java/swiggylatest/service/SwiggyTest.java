package swiggylatest.service;

import swiggylatest.model.Menu;
import swiggylatest.model.OTP;
import swiggylatest.model.Restaurant;
import swiggylatest.model.User;

public class SwiggyTest {

    public static void main(String[] args) {
        User user = new User();
        user.name = "Chandu";
        user.mobileNo = "9908";


        Menu menu = new Menu();
        menu.name = "Biryani";
        menu.status = true;
        menu.price = 800;

        Restaurant restaurant = new Restaurant();
        restaurant.name = "Mehfil";
        restaurant.city = "Hyderabad";
        restaurant.street = "kphb";
        restaurant.pinCode = "500048";
        restaurant.menu = menu;
        restaurant.user = user;

        SwiggyService service = new SwiggyService();
        OTP otpResponse = service.registerRestaurant(restaurant);

        OTP inputotp = otpResponse;

        String response = service.validateOTP(inputotp, restaurant.user);
        System.out.println(response);
    }
}

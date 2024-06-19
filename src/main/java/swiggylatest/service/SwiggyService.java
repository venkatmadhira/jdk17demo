package swiggylatest.service;
import swiggylatest.model.OTP;
import swiggylatest.model.Restaurant;
import swiggylatest.model.User;

import java.util.Date;
import java.util.UUID;

public class SwiggyService {

    public static Restaurant restaurantStaticVariable;
    public OTPService otpService = new OTPService();

    public OTP registerRestaurant(Restaurant restaurant){
        restaurantStaticVariable = restaurant;
        return otpService.generateOTP(restaurant.user);
    }

    public String validateOTP(OTP inputotp, User user){
        return otpService.otpValidation(inputotp,user);
}

}

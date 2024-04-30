package newswiggy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SwiggyService {
    Supplier<RestaurantResponse> supplierFunction=()->{

        Dish luckyDish1= new Dish("biryani","non-veg");

        Rating dish2Rating= new Rating("4","good");

        Dish luckyDish2= new Dish("biryani","veg");

        List<Dish> dishList=new ArrayList<>();
        dishList.add(luckyDish1);
        dishList.add(luckyDish2);

        Rating rest1RAting= new Rating("4","best one in this area");

        Restaurant restaurant= new Restaurant("lucky",dishList,rest1RAting);


        Dish mhefilDish1= new Dish("biryani","non-veg");


        Dish mhefilDish2= new Dish("biryani","non- veg");

        List<Dish>dishList1=new ArrayList<>();
        dishList1.add(mhefilDish1);
        dishList1.add(mhefilDish2);

        Rating rating= new Rating("4.5","food is budget friendly ");

        Restaurant restaurant1= new Restaurant("mehfil",dishList1,rating);

        Map<Integer,Restaurant> restaurantMap= new HashMap<>();

        restaurantMap.put(restaurant.hashCode(),restaurant);
        restaurantMap.put(restaurant1.hashCode(),restaurant1);

        RestaurantResponse restaurantResponse= new RestaurantResponse();

        restaurantResponse.restaurantMap=restaurantMap;

        RestaurantService restaurantService=new RestaurantService();

        UserLoginService userLoginService= new UserLoginService();
        String userName="anil@123";
        String passWord="12345";
        Boolean validate= userLoginService.loginValidate(userName,passWord);

        if(validate) {

            Dish dish = new Dish("biryani", "non-veg");

            restaurantService.getRestuarntService(restaurantResponse, "lucky", dish);

        }

        return restaurantResponse;
    };
}

package newswiggy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SwiggyService {
    Supplier<RestaurantResponse> supplierFunction=()->{

        Dish luckyDish1= new Dish("Biryani","Non-Veg");

        Dish luckyDish2= new Dish("Biryani","Veg");

        List<Dish> dishList=new ArrayList<>();
        dishList.add(luckyDish1);
        dishList.add(luckyDish2);

        Rating rating2= new Rating("4.2","best one in this area");

        Restaurant restaurant= new Restaurant("Pista House",dishList,rating2);


        Dish mehfilDish1= new Dish("Biryani","Non-Veg");


        Dish mehfilDish2= new Dish("Pulav","Non-Veg");

        List<Dish>dishList1=new ArrayList<>();
        dishList1.add(mehfilDish1);
        dishList1.add(mehfilDish2);

        Rating rating= new Rating("4.5","food is budget friendly ");

        Restaurant restaurant1= new Restaurant("Mehfil",dishList1,rating);

        Map<Integer,Restaurant> restaurantMap= new HashMap<>();

        restaurantMap.put(restaurant.hashCode(),restaurant);
        restaurantMap.put(restaurant1.hashCode(),restaurant1);

        RestaurantResponse restaurantResponse= new RestaurantResponse();

        restaurantResponse.restaurantMap=restaurantMap;

        RestaurantService restaurantService=new RestaurantService();

        UserLoginService userLoginService= new UserLoginService();
        String userName="abc@gmail.com";
        String passWord="123456";
        Boolean validate= null;
        try {
            validate = userLoginService.loginValidate(userName,passWord);
        } catch (CustomCheckedException e) {
            System.out.println(e.errorCode+"----"+e.getMessage());
        }

        if(validate!=null) {
            Dish dish = new Dish("Biryani", "Non-Veg");
            restaurantService.getRestuarntService(restaurantResponse, "Mehfil", dish);
        }
        return restaurantResponse;
    };
}

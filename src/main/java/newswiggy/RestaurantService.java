package newswiggy;

public class RestaurantService {
    public void getRestuarntService(RestaurantResponse restaurantResponse, String name, Dish dishName){
        restaurantResponse.restaurantMap.forEach((K,V) ->{
            if(V.restaurantName.equals(name)){
                System.out.println("restaurant name : "+name);
                V.dishList.forEach((dish)->{
                    if(dish.dishName.equals(dishName.dishName)&&dish.dishType.equals(dishName.dishType)){
                        System.out.println("selected dish is :"+ dishName.dishName+"----"+"dish type: "+dish.dishType);

                    }
                });
            }
        });
    }

}

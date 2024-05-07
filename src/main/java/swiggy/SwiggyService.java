package swiggy;

public class SwiggyService {

    public void orderFood() throws CheckedException {
        Swiggy swiggy = new Swiggy();
        RestaurantService restaurantService = new RestaurantService();
        DishService dishService = new DishService();

        Dish biryani = new Dish("ChickenBiryani", 180.00);
        Dish chicken65 = new Dish("Chicken65", 180.00);
        Dish mandi = new Dish("Mandi", 300.00);
        Dish mutton = new Dish("MuttonBiryani", 250.00);
        Dish fish = new Dish("FishFry", 280.00);

        biryani.setRating(4.5);
        chicken65.setRating(4.2);
        mandi.setRating(4.8);

        Address address1 = new Address("Jntu", "Hyd", "500085");
        Restaurant restaurant1 = new Restaurant("Mehfil", address1);
        restaurant1.addToMenu(biryani);
        restaurant1.addToMenu(chicken65);
        restaurant1.addToMenu(fish);
        restaurant1.setRating(4.3);

        Address address2 = new Address("Gachibowli", "Hyd", "500060");
        Restaurant restaurant2 = new Restaurant("Jail Mandi", address2);
        restaurant2.addToMenu(mandi);
        restaurant2.addToMenu(biryani);
        restaurant2.addToMenu(mutton);

        restaurant2.setRating(4.6);

        swiggy.addRestaurant(restaurant1);
        swiggy.addRestaurant(restaurant2);

        SwiggyProcess swiggyProcess=new SwiggyProcess();
        swiggyProcess.process(restaurantService,dishService,swiggy);

    }

    public static void main(String[] args) {
        SwiggyService swiggyService = new SwiggyService();
        try {
            swiggyService.orderFood();
        } catch (CheckedException e) {
            System.out.println(e.code + "-----" + e.getMessage());
        }
    }
}


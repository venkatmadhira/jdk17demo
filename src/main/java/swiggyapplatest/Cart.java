package swiggyapplatest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Cart {
    public List<Dish> items =new ArrayList<>();
   // public Map<Integer,Dish> items=new HashMap<>();
//    public Cart() {
//        this.items = new ArrayList<>();
//    }

    Consumer<Dish>addItem=(dish)->{
        items.add(dish);
    };
//    Consumer<Dish>addItem=(dish)->{
//        items.put(dish.hashCode(),dish);
//    };
    Supplier<List<Dish>> getItems= () ->{
         return items;
    };
//    Supplier<Map<Integer,Dish>> getItems= () ->{
//        return items;
//    };
    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Dish item : items) {
            totalPrice += item.price;
        }
        return totalPrice;
    }
}


package swiggy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Cart {
    public List<Dish> items = new ArrayList<>();
    Consumer<Dish> addItem = (dish) -> {
        items.add(dish);
    };
    Supplier<List<Dish>> getItems = () -> {
        return items;
    };

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

package swiggy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Cart {
    private List<Dish> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Consumer<Dish> addItem = dish -> items.add(dish);
    public List<Dish> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Dish::getPrice).sum();
    }

}


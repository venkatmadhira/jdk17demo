package newdemo;

import java.util.ArrayList;
import java.util.List;

class Product {
    public String type;
    public List<String> availableColors;
    public double price;

    public Product(String type, double price) {
        this.type = type;
        this.availableColors = new ArrayList<>();
        this.price = price;
    }

    public void color(String color) {
        availableColors.add(color);
    }

    public boolean colorAvailable(String color) {
        return availableColors.contains(color);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
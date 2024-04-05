package newdemo;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> clothes;

    public Shop() {
        this.clothes = new ArrayList<>();
    }
    public void addClothing(Product clothing) {
        clothes.add(clothing);
    }
    public Product findClothing(String type, String color) {
        for (Product clothing : clothes) {
            if (clothing.getType().equals(type) && clothing.colorAvailable(color)) {
                return clothing;
            }
        }
        return null;
    }
    public boolean purchase(String type, String color, CreditCard creditCard) {
        Product selectedClothing = findClothing(type, color);
        if (selectedClothing != null) {
            return processPayment(selectedClothing, creditCard);
        } else {
            System.out.println("Sorry, the requested clothing is not available.");
            return false;
        }
    }
    public boolean processPayment(Product clothing, CreditCard creditCard) {
        double price = clothing.getPrice();
        if (creditCard.processPayment(price)) {
            return true;
        } else {
            System.out.println("Payment failed. Please try again.");
            return false;
        }
    }
}
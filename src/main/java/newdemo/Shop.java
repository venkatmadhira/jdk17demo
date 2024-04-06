package newdemo;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Product findProduct(String type, String color) {
        for (Product product : products) {
            if (product.getType().equals(type) && product.colorAvailable(color)) {
                return product;
            }
        }
        return null;
    }
    public boolean purchase(String type, String color, CreditCard creditCard) {
        Product selectedProduct= findProduct(type, color);
        if (selectedProduct != null) {
            return processPayment(selectedProduct, creditCard);
        } else {
            System.out.println("Sorry, the requested clothing is not available.");
            return false;
        }
    }
    public boolean processPayment(Product product, CreditCard creditCard) {
        double price = product.getPrice();
        if (creditCard.processPayment(price)) {
            return true;
        } else {
            System.out.println("Payment failed. Please try again.");
            return false;
        }
    }
}
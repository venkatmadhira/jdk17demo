package productmanage;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Clothing> clothes;
    public PaymentProcessor paymentProcessor;

    public Shop(PaymentProcessor paymentProcessor) {
        this.clothes = new ArrayList<>();
        this.paymentProcessor = paymentProcessor;
    }

    public void addClothing(Clothing clothing) {
        clothes.add(clothing);
    }

    public boolean purchase(String type, String color) {
        Clothing selectedClothing = findClothing(type, color);
        if (selectedClothing != null) {
            double price = selectedClothing.getPrice();
            return processPayment(price);
        } else {
            System.out.println("Sorry, the requested clothing is not available.");
            return false;
        }
    }

    public Clothing findClothing(String type, String color) {
        for (Clothing clothing : clothes) {
            if (clothing.getType().equals(type) && clothing.colorAvailable(color)) {
                return clothing;
            }
        }
        return null;
    }

    public boolean processPayment(double amount) {
        return paymentProcessor.processPayment(amount);
    }
}

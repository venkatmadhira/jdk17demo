package newdemo;
import java.util.ArrayList;
import java.util.List;
public class Shop {
    public List<Clothing> clothes;

    public Shop() {
        this.clothes = new ArrayList<>();
    }
    public void addClothing(Clothing clothing) {
        clothes.add(clothing);
    }
    public boolean processPayment(CreditCard creditCard, double amount) {
        creditCard.setBalance(creditCard.getBalance() - amount);
        return true;
    }
    public boolean purchaseWithCreditCard(String type, String color, CreditCard creditCard) {
        for (Clothing clothing : clothes) {
            if (clothing.getType().equals(type) && clothing.colorAvailable(color)) {
                if (creditCard.getBalance() >= clothing.getPrice()) {
                    if (processPayment(creditCard, clothing.getPrice())) {
                        return true;
                    } else {
                        System.out.println("Payment failed. Please try again.");
                        return false;
                    }
                } else {
                    System.out.println("Insufficient balance on the credit card.");
                    return false;
                }
            }
        }
        System.out.println("Sorry, the requested clothing is not available.");
        return false;
    }
}


package swiggy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PaymentService {
    private List<Payment> payments;
    private CreditCard creditCard;

    public PaymentService(CreditCard creditCard) {
        this.payments = new ArrayList<>();
        this.creditCard = creditCard;
    }

    public void makePayment(double amount, String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("Credit Card")) {
            if (creditCard.getBalance() >= amount) {
                creditCard.deductAmount(amount);
                System.out.println("Payment of Rs:" + amount + " made using " + paymentMethod);
            } else {
                System.out.println("Insufficient balance in credit card.");
            }
        } else {
            System.out.println("Invalid payment method.");
        }
    }

    public List<Payment> getPayments() {
        return payments;
    }
}


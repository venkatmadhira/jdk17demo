package swiggy;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, Payment> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
        paymentMethods.put("Phonepay", new Phonepay(10000));
        paymentMethods.put("CreditCard", new CreditCard(25000));
        paymentMethods.put("Cash", new Cash());
    }

    public void makePayment(double amount, String paymentMethod) throws CheckedException {
        Payment payment = paymentMethods.get(paymentMethod);

        if (payment == null) {
            System.out.println("Invalid payment method.");
            return;
        }
        payment.makePayment(amount);
    }
}

package swiggyapp;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public List<Payment> payments;
    public PaymentService() {
        this.payments = new ArrayList<>();
    }
    public void makePayment(double amount, String paymentMethod) {
        Payment payment = new Payment(amount, paymentMethod);
        payments.add(payment);
        System.out.println("Payment of Rs:" + amount + " made using " + paymentMethod);
    }
    public List<Payment> getPayments() {
        return payments;
    }
}

package productmanage;

public class PaymentProcessor {
    public PaymentProvider paymentProvider;

    public PaymentProcessor(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public boolean processPayment(double amount) {
        return paymentProvider.processPayment(amount);
    }
}

package productmanage;

public class CreditCardPaymentProvider implements PaymentProvider {
    public CreditCard creditCard;

    public CreditCardPaymentProvider(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean processPayment(double amount) {
        if (creditCard.getBalance() >= amount) {
            creditCard.setBalance(creditCard.getBalance() - amount);
            return true;
        } else {
            System.out.println("Insufficient balance on the credit card.");
            return false;
        }
    }
}

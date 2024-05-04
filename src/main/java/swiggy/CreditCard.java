package swiggy;

public class CreditCard implements Payment {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }
    @Override
    public void makePayment(double amount) throws CheckedException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of Rs:" + amount + " made using Credit Card. Remaining balance: Rs" + balance);
        } else {
            throw new CheckedException(ExceptionHandling.INSUFFICIENT_FUNDS.code,ExceptionHandling.INSUFFICIENT_FUNDS.message);
        }
    }
}





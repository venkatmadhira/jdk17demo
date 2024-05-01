package swiggy;
public class CreditCard {
    private double balance;

    public CreditCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deductAmount(double amount) {
        balance -= amount;
    }
}


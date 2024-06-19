package account;

public class Account {
    public double balance;
    public static final double minBal = 500.0;

    public Account(double initialBalance) {
        if (initialBalance < minBal) {
            this.balance = minBal;
        } else {
            this.balance = initialBalance;
        }
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdraw amount must be positive");
        } else if (balance - amount < minBal) {
            System.out.println("Error: Cannot withdraw amount. Balance cannot be less than " + minBal);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New balance: " + balance);
        }
    }
}

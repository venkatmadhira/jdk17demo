package account;

public class Service {
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
    public void displayBalance(Account account) {
        System.out.println("Current balance: " + account.balance);
    }
}


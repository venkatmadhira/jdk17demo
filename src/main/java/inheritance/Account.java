package inheritance;

// Parent class
class Account {
    private String accountNumber;
    protected double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs:" + amount + " into account " + accountNumber);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Rs:" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    // Method to display account information
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs:" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


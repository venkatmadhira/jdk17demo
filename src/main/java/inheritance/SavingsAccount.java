package inheritance;

// Child class inheriting from Account
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor with interest rate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call to parent class constructor
        this.interestRate = interestRate;
    }

    // Method overriding to customize withdraw behavior
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Rs:" + amount + " from savings account " + getAccountNumber());
        } else {
            System.out.println("Insufficient balance in savings account " + getAccountNumber());
        }
    }

    // Method to add interest (method overloading)
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest); // Using deposit method of parent class
        System.out.println("Added interest of Rs:" + interest + " to account " + getAccountNumber());
    }

    // Constructor overloading without interest rate
    public SavingsAccount(String accountNumber, double balance) {
        this(accountNumber, balance, 0.0); // Call to another constructor in the same class
    }
}


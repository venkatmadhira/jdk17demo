package inheritance;

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating savings account with interest rate
        SavingsAccount savingsAccount1 = new SavingsAccount("Savings Account-1", 1000.0, 2.5);
        savingsAccount1.display(); // Display initial balance
        savingsAccount1.addInterest(); // Add interest
        savingsAccount1.display(); // Display updated balance
        savingsAccount1.withdraw(200.0); // Customized withdraw method
        savingsAccount1.display(); // Display updated balance

        // Creating savings account without interest rate
        SavingsAccount savingsAccount2 = new SavingsAccount("Savings Account-2", 500.0);
        savingsAccount2.display(); // Display initial balance
        savingsAccount2.withdraw(600.0); // Customized withdraw method

        // Creating checking account (generic Account)
        Account checkingAccount = new Account("Check Account", 500.0);
        checkingAccount.display(); // Display initial balance
        checkingAccount.deposit(200.0); // Deposit
        checkingAccount.withdraw(50.0); // Withdraw
        checkingAccount.display(); // Display updated balance
    }
}


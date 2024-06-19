package account;

public class ConstructorOverLoading {
        public String accountNumber;
        public String accountHolderName;
        public double balance;

        public ConstructorOverLoading(String accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = 0.0;
        }

        public ConstructorOverLoading(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public ConstructorOverLoading(double initialBalance) {
            this.accountNumber = "UNKNOWN";
            this.accountHolderName = "Anonymous";
            this.balance = initialBalance;
        }

        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Balance: Rs:" + balance);
        }

        public static void main(String[] args) {

            ConstructorOverLoading account1 = new ConstructorOverLoading("123456", "Venkat");
            ConstructorOverLoading account2 = new ConstructorOverLoading("789012", "Sateesh", 500.0);
            ConstructorOverLoading account3 = new ConstructorOverLoading(1000.0);

            account1.displayAccountInfo();
            System.out.println();
            account2.displayAccountInfo();
            System.out.println();
            account3.displayAccountInfo();
        }
    }



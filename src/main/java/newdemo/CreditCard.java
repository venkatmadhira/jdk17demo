package newdemo;

class CreditCard {
    public String cardNumber;
    public String expirationDate;
    public String cvv;
    public double balance;

    public CreditCard(String cardNumber, String expirationDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.balance = balance;
    }
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance on the credit card.");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }

}

package productmanage;

public class CreditCard {
    public String cardNumber;
    public String expirationDate;
    public String cvv;
    private double balance;

    public CreditCard(String cardNumber, String expirationDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

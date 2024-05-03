package swiggy;

public interface Payment {
    void makePayment(double amount) throws CheckedException;
}

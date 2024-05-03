package swiggy;
public class Cash implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs:" + amount + " made using Cash.");
    }
}



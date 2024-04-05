package productmanage;

public interface Purchaseable {
    boolean purchase(String type, String color, PaymentProvider paymentProvider);
}

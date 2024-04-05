package productmanage;
public class Test {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234 5678 9012 3456", "12/25", "123", 10000.0);

        CreditCardPaymentProvider paymentProvider = new CreditCardPaymentProvider(creditCard);

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentProvider);

        Shop shop = new Shop(paymentProcessor);

        Clothing shirts = new Clothing("Shirt", 2000.0);
        shirts.color("Red");
        shirts.color("Blue");
        shirts.color("Green");

        Clothing jeans = new Clothing("Jeans", 3000.0);
        jeans.color("Blue");
        jeans.color("Black");

        Clothing tShirts = new Clothing("tShirt", 1500.0);
        tShirts.color("White");
        tShirts.color("Maroon");

        shop.addClothing(shirts);
        shop.addClothing(jeans);
        shop.addClothing(tShirts);

        String desiredType = "Shirt";
        String desiredColor = "Red";
        System.out.println("My Credit Card Available Balance Rs: "+creditCard.getBalance());

        if (shop.purchase(desiredType, desiredColor)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor + " " + desiredType + ".");
            System.out.println("Price Of This Product Rs: "+shirts.price);
            System.out.println("Remaining balance on the credit card: Rs: " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
        String desiredType1 = "Jeans";
        String desiredColor1 = "Blue";

        if (shop.purchase(desiredType1, desiredColor1)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor1 + " " + desiredType1 + ".");
            System.out.println("Price Of This Product Rs: "+jeans.price);
            System.out.println("Remaining balance on the credit card: Rs: " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
        String desiredType2 = "tShirt";
        String desiredColor2 = "White";

        if (shop.purchase(desiredType2, desiredColor2)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor2 + " " + desiredType2 + ".");
            System.out.println("Price Of This Product Rs: "+tShirts.price);
            System.out.println("Remaining balance on the credit card: Rs: " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
    }
}




package newdemo;

public class Test {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234 5678 9012 3456", "12/25", "123", 10000.0);

        Shop shop = new Shop();

        Product shirts = new Product("Shirt", 2000.0,"L");
        shirts.color("Red");
        shirts.color("Blue");
        shirts.color("Green");


        Product jeans = new Product("Jeans", 3000.0,"34");
        jeans.color("Blue");
        jeans.color("Black");

        Product tShirts = new Product("T-Shirts", 1500.0,"L");
        tShirts.color("White");
        tShirts.color("Maroon");

        shop.addProduct(shirts);
        shop.addProduct(jeans);
        shop.addProduct(tShirts);

        String desiredType = "Shirt";
        String desiredColor = "Red";
        String desireSize="L";
        System.out.println("My Credit Card Available Balance Rs: "+creditCard.getBalance());

        if (shop.purchase(desiredType, desiredColor, creditCard,desireSize)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor + " " + desiredType + ".");
            System.out.println("Price Of This Product Rs: "+shirts.price);
            System.out.println("Remaining balance on the credit card: Rs: " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
        String desiredType1 = "Jeans";
        String desiredColor1 = "Blue";
        String desireSize1="34";
        System.out.println("My Credit Card Available Balance Rs: "+creditCard.getBalance());

        if (shop.purchase(desiredType1, desiredColor1, creditCard,desireSize1)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor1 + " " + desiredType1 + ".");
            System.out.println("Price Of This Product Rs: "+jeans.price);
            System.out.println("Remaining balance on the credit card: Rs: " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
    }
}
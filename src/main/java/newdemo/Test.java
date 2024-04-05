package newdemo;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Clothing shirts = new Clothing("Shirt", 2000.0);
        shirts.color("Red");
        shirts.color("Blue");
        shirts.color("Green");

        Clothing jeans = new Clothing("Jeans", 3000.0);
        jeans.color("Blue");
        jeans.color("Black");

        Clothing tShirts = new Clothing("T-Shirts", 1500.0);
        tShirts.color("White");
        tShirts.color("Maroon");

        shop.addClothing(shirts);
        shop.addClothing(jeans);
        shop.addClothing(tShirts);

        CreditCard creditCard = new CreditCard("1234 5678 9012 3456", "12/25", "123", 10000.0);

        String desiredType = "Shirt";
        String desiredColor = "Red";
        System.out.println("Credit Card Balance Was:  "+creditCard.getBalance());

        if (shop.purchaseWithCreditCard(desiredType, desiredColor, creditCard)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor + " " + desiredType + ".");
            System.out.println("Shirt price Was:  "+shirts.price);
            System.out.println("Remaining balance on the credit card: Rs:  " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
        String desiredType2 = "Shirt";
        String desiredColor2 = "Red";
        System.out.println("Credit Card Balance Was:  "+creditCard.getBalance());

        if (shop.purchaseWithCreditCard(desiredType2, desiredColor2, creditCard)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor2 + " " + desiredType2 + ".");
            System.out.println("Shirt price Was:  "+shirts.price);
            System.out.println("Remaining balance on the credit card: Rs:  " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }

        String desiredType1 = "Jeans";
        String desiredColor1 = "Blue";
        System.out.println("Credit Card Balance Was:  "+creditCard.getBalance());

        if (shop.purchaseWithCreditCard(desiredType1, desiredColor1, creditCard)) {
            System.out.println("Congratulations! You have successfully purchased the " + desiredColor1 + " " + desiredType1 + ".");
            System.out.println("Shirt price Was:  "+jeans.price);
            System.out.println("Remaining balance on the credit card: Rs:  " + creditCard.getBalance());
        } else {
            System.out.println("Sorry, the purchase was unsuccessful.");
        }
    }
}


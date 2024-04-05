package newdemo;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Clothing shirts = new Clothing("Shirt");
        shirts.color("Red");
        shirts.color("Blue");
        shirts.color("Green");

        Clothing jeans = new Clothing("Jeans");
        jeans.color("Blue");
        jeans.color("Black");

        Clothing tShirts = new Clothing("tShirts");
        tShirts.color("White");
        tShirts.color("Maroon");

        shop.clothing(shirts);
        shop.clothing(jeans);
        shop.clothing(tShirts);

        String desiredType = "Shirt";
        String desiredColor = "Red";

        if (shop.colorAvailable(desiredType, desiredColor)) {
            System.out.println("The " + desiredColor + " " + desiredType + " is available. You can buy it.");
        } else {
            System.out.println("The " + desiredColor + " " + desiredType + " is not available.");
        }
    }
}

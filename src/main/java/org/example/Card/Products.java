package org.example.Card;

public class Products  extends LoginProcess {
    public int shirtsPrice ;
    public int jeansPrice ;
    public int totalPrice;
    public  int noOfItems;


    public int items() {
        totalPrice = shirtsPrice*noOfItems + jeansPrice*noOfItems;
        System.out.println("Products Price " + totalPrice);
        return  totalPrice;

}

}

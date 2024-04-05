package org.example.Card;

public class PaymentMethod extends Products {

    public  int accountBalance = 10000;
    public  int remainingBalance;
    public int addBalance;
    public int finalBalance;


    public int payment(Products products){
         remainingBalance = accountBalance- products.items();
         addBalance=products.items();
         finalBalance=addBalance+remainingBalance;
         return remainingBalance;


     }

}

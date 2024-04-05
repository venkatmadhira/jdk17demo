package org.example.Card;

public class LoginTest {
    public static void main(String[] args) {

        Login login = new Login();
        LoginProcess loginProcess = new LoginProcess();
        loginProcess .login("Chandu","1234" );
        System.out.println(loginProcess);

        PaymentMethod paymentMethod = new PaymentMethod();
        Products products = new Products();
        products.noOfItems= 2;
        products.shirtsPrice = 500;
        products.jeansPrice= 500;


        paymentMethod.payment(products);
        System.out.println(    "Account Balance: " + paymentMethod.accountBalance);
        System.out.println( "Remaining Balance :"+ paymentMethod.remainingBalance);
        System.out.println("Add Balance : "+ paymentMethod.addBalance);
        System.out.println("After Add Balance to the Remaining balance Final Balance is :"+paymentMethod.finalBalance);


    }
}

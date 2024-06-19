package immmutable;

public class PaymentTest {
    public static void main(String[] args) {

            Payment payment1=new Payment(500,"Venkat","Sateesh","1111","2222");
            Payment payment2=new Payment("Venkat","Sateesh",1000,"1234","2345");

            System.out.println(payment1);
            System.out.println(payment2);

        }
    }


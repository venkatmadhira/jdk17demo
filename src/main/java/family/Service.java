package family;

public class Service {

    public static void main(String[] args) {


        Family a =new Family();
        Address address1=new Address();
        address1.city="NRT";
        address1.flatNo="1-123";
        address1.pinCode="522408";
        address1.street="Arundalpet";

        a.address=address1;
        a.name="A";
        a.age="80";
        a.gender="Male";

        Family[] aKids=new Family[2];

        Family b =new Family();
        Address bAddress1=new Address();
        bAddress1.city="NRT";
        bAddress1.flatNo="1-123";
        bAddress1.pinCode="522408";
        bAddress1.street="Arundalpet";

        b.address=bAddress1;
        b.name="B";
        b.age="70";
        b.gender="Female";






    }
}

package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args){
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="Harrier";
        Car car2=new Car();
        car2.name="Harrier";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);

        Address address=new Address();
        address.area="KPHB";
        address.street="Colony";
        address.flatNo="102";
        address.pinCode="500085";
        address.state="TG";

        Address address1=new Address();
        address1.area="KPHB";
        address1.street="Colony";
        address1.flatNo="102";
        address1.pinCode="500085";
        address1.state="TG";

        Set<Address> addressSet=new HashSet<>();
        addressSet.add(address);
        addressSet.add(address1);
        System.out.println(addressSet);

    }
}

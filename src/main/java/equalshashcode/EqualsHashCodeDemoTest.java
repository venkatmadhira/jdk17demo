package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
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

        Address address2=new Address();
        address2.area="KPHB";
        address2.street="Colony";
        address2.flatNo="103";
        address2.pinCode="500085";
        address2.state="TG";

        System.out.println(address.equals(address));//Reflexive Rule
        System.out.println(address.equals(address1));//Symmetric Rule
        System.out.println(address1.equals(address));
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());
        // another rule is Consistent rule i.e when we provide multiple prints it will always shows the output either true/false.
        System.out.println(address.equals(address1));//Transitive Rule
        System.out.println(address1.equals(address2));
        System.out.println(address.equals(address2));
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

        System.out.println(address2.hashCode());
        System.out.println(address2.hashCode());
        System.out.println(address2.hashCode());
        System.out.println(address2.hashCode());

    }
}

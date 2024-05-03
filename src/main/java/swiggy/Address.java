package swiggy;

public class Address {
    public String street;
    public String city;
    public String pinCode;

    public Address(String street, String city, String pinCode) {
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + pinCode;
    }
}

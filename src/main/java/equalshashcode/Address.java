package equalshashcode;

import java.util.Objects;

public class Address {

   public String area;
    public String street;
    public String pinCode;
    public String flatNo;
    public String state;
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(this.getClass() !=(o.getClass())){
            return false;
        }
        Address address = (Address) o;
        //Type Cast
        return this.area.equals(address.area) && this.street.equals(address.street)&&this.pinCode.equals(address.pinCode)
                &&this.flatNo.equals(address.flatNo)&&this.state.equals(address.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(area, street, pinCode, flatNo, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

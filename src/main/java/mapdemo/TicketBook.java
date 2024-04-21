package mapdemo;

import java.util.Objects;

public class TicketBook {
    String pnrId;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketBook that = (TicketBook) o;
        return Objects.equals(pnrId, that.pnrId) && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "pnrId='" + pnrId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnrId, name);
    }
}

package ticket;

import java.util.Arrays;
import java.util.Date;


public class Ticket {

    public Row[] rows;
    public Date time;
    public int noOfSeats;

    public Ticket(Row[] rows, Date time, int noOfSeats) {
        this.rows = rows;
        this.time = time;
        this.noOfSeats = noOfSeats;
    }
    public void bookTicket() {
        if (rows != null) {
            for (Row row : rows) {
                System.out.println(row);
            }
        }
    }
    public void setNoOfSeats(int minSeats) {
        if (noOfSeats >= minSeats) {
            bookTicket();
        } else {
            System.out.println("Seats are less than " + minSeats);
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rows=" + Arrays.toString(rows) +
                ", time=" + time +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}


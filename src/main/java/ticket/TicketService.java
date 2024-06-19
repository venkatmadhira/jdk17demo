package ticket;

import java.util.Date;

public class TicketService {
    public Ticket bookTicket(){
        Row row1 = new Row("A", new int[]{1});
        Row row2 = new Row("B", new int[]{1});
        Row[] rows = {row1, row2};

        Date currentTime = new Date();
        Ticket ticket = new Ticket(rows, currentTime, 6);

        ticket.setNoOfSeats(5);
        return ticket;
    }
}

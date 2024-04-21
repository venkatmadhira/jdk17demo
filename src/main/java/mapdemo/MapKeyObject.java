package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapKeyObject {
    public static void main(String[] args) {
        Map<TicketBook,TicketBook> ticketBookMap=new HashMap<>();
        TicketBook ticketBook=new TicketBook();
        ticketBook.name="venkat";
        ticketBook.pnrId="123456789";

        TicketBook ticketBook1=new TicketBook();
        ticketBook1.name="venkat";
        ticketBook1.pnrId="123456789";
        ticketBookMap.put(ticketBook,ticketBook);
        ticketBookMap.put(ticketBook1,ticketBook1);

        System.out.println(ticketBookMap);
        System.out.println(ticketBookMap.size());


    }
}

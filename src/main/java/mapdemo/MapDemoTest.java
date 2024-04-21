package mapdemo;
import java.util.*;

public class MapDemoTest {
    public static void main(String[] args) {
        Map<Integer,TicketBook> ticketBookMap=new HashMap<>();
        List<TicketBook> ticketBookList=new ArrayList<>();
        for (int i=0;i<1000000;i++){
            TicketBook ticketBook=new TicketBook();
            ticketBook.name="venkat";
            ticketBook.pnrId="123456789"+i;

            ticketBookMap.put(ticketBook.hashCode(),ticketBook);
            ticketBookList.add(ticketBook);
        }
        Set<Map.Entry<Integer,TicketBook>> entrySet=ticketBookMap.entrySet();
        Iterator<Map.Entry<Integer,TicketBook>> entryIterator=entrySet.iterator();
        for (;entryIterator.hasNext();){
            Map.Entry<Integer,TicketBook> mapNext=entryIterator.next();
            System.out.println("Iterator loop ----"+mapNext.toString());
        }
        ticketBookMap.forEach((k,v)->{
            System.out.println("key from foreach"+k+"value"+v.toString());
        });
        TicketBook ticketBook1=new TicketBook();
        ticketBook1.name="venkat";
        ticketBook1.pnrId="123456789900000";
        System.out.println("getting from list");
        long listStartTime=System.currentTimeMillis();
        Iterator<TicketBook> bookIterator=ticketBookList.iterator();
        for (;bookIterator.hasNext();){
           TicketBook tt= bookIterator.next();
           if(tt.equals(ticketBook1)){
               System.out.println("Find the ticket from list"+tt.pnrId);
               break;
           }
        }
        long listEndTime=System.currentTimeMillis();
        System.out.println("time taken"+(listEndTime-listStartTime));
        System.out.println("getting ticket from map");
        long mapStartTime=System.currentTimeMillis();
        TicketBook mapTicket=ticketBookMap.get(ticketBook1.hashCode());
        System.out.println("Find the ticket from map"+mapTicket.pnrId);
        long mapEndTime=System.currentTimeMillis();
        System.out.println("Time taken map"+(mapEndTime-mapStartTime));
    }
}

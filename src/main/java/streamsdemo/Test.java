package streamsdemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){
        List<Ticket> ticketList =new ArrayList<>();
        Ticket ticket =new Ticket();
        ticket.pnrId= UUID.randomUUID().toString();
        ticket.status="Success";

        Ticket ticket1 =new Ticket();
        ticket1.pnrId=UUID.randomUUID().toString();
        ticket1.status="Success";

        Ticket ticket2 =new Ticket();
        ticket2.pnrId=UUID.randomUUID().toString();
        ticket2.status="Locked";

        Ticket ticket3 =new Ticket();
        ticket3.pnrId=UUID.randomUUID().toString();
        ticket3.status="Locked";

        Ticket ticket4 =new Ticket();
        ticket4.pnrId=UUID.randomUUID().toString();
        ticket4.status="Failed";

        ticketList.add(ticket);
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        ticketList.add(ticket4);

        Predicate<Ticket> predicate=(ticket5) -> ticket5.status.equals("Success");
        //BiPredicate<Ticket,Boolean> predicate1=((ticket5, aBoolean) -> ticket5.status.equals("Success")&&aBoolean);

        for (int i=0;i<ticketList.size();i++){
            Ticket listTicket=ticketList.get(i);
            if(listTicket.status.equals("Locked")){
                System.out.println("Normal ForLoop-----"+listTicket.status +"---"+listTicket.pnrId);
            }
        }
        Iterator<Ticket> iterator=ticketList.iterator();
        for (;iterator.hasNext();){
            Ticket iteratorTicket=iterator.next();
            if (predicate.test(iteratorTicket)){
                System.out.println("Iterator Loop-----"+iteratorTicket.status+"----"+iteratorTicket.pnrId);
            }
        }
        ticketList.forEach(ticket5 -> {
            if(ticket5.status.equals("Failed")) {
                System.out.println("Consumer Function---"+ticket5.status + "---" + ticket5.pnrId);
            }
        });




    }
}

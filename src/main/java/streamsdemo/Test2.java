package streamsdemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
public class Test2 {
    //You can pass function interface as a parameter and here is an example---->
    public void ticketStatus(List<Ticket> ticketList,Predicate<Ticket> ticketPredicate){
        Iterator<Ticket> iterator=ticketList.iterator();
        for (;iterator.hasNext();){
            Ticket iteratorTicket=iterator.next();
            if (ticketPredicate.test(iteratorTicket)){
                System.out.println("Iterator Loop-----"+iteratorTicket.status+"----"+iteratorTicket.pnrId);
            }
        }
    }
    public static void main(String[] args) {
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

        Predicate<Ticket> successPredicate=(ticket5) -> ticket5.status.equals("Success");
        Predicate<Ticket> failedPredicate=(ticket5) -> ticket5.status.equals("Failed");
        Predicate<Ticket> lockedPredicate=(ticket5) -> ticket5.status.equals("Locked");

        Test2 test2=new Test2();
        test2.ticketStatus(ticketList,successPredicate);
        test2.ticketStatus(ticketList,failedPredicate);
        test2.ticketStatus(ticketList,lockedPredicate);
    }
}

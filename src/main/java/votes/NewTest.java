package votes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        Voter voter1 = new Voter();
        voter1.name = "Siva";
        voter1.aadharNo = "1111";
        voter1.status = "Yes";

        Voter voter2 = new Voter();
        voter2.name = "Sipu";
        voter2.aadharNo = "1122";
        voter2.status = "No";

        Voter voter3 = new Voter();
        voter3.name = "Hari";
        voter3.aadharNo = "2222";
        voter3.status = "Yes";

        Voter voter4 = new Voter();
        voter4.name = "Krish";
        voter4.aadharNo = "3333";
        voter4.status = "Yes";

        Voter voter5 = new Voter();
        voter5.name = "Ram";
        voter5.aadharNo = "4444";
        voter5.status = "No";

        List<Voter> voterList = new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);
        voterList.add(voter1);
        voterList.add(voter4);

        Iterator<Voter> iterator = voterList.iterator();

        List<String> seenAadharNo = new ArrayList<>();
        for (;iterator.hasNext();) {
            Voter voter = iterator.next();
            if (!seenAadharNo.contains(voter.aadharNo)) {
                seenAadharNo.add(voter.aadharNo);
                if (voter.status.equals("Yes")) {
                    System.out.println(voter.name + " has casted his vote.");
                } else {
                    System.out.println(voter.name + " has not casted his vote.");
                }
            } else {
                System.out.println(voter.name + " is already in list. This is duplicate.");
            }
        }
    }
}

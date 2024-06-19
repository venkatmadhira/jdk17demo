package election;

public class ConstituencyTest {
    public static void main(String[] args) {
        ElectionService service=new ElectionService();
        State state=service.getState();
        System.out.println(state.constituencies[0].noOfVoters);
        System.out.println(state.constituencies[0].constName);
        System.out.println(state.constituencies[0].type);


    }
}

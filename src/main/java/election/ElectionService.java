package election;

public class ElectionService {
    public State getState(){
        State state=new State();
        Constituency con=new Constituency();
        state.stateName="TG";
        Constituency[] constituencies=new Constituency[2];
        state.constituencies=constituencies;
        con.constName="HYD";
        con.noOfVoters=200000;
        con.type="MP";
        con.state=state;
        constituencies[0]=con;

        return state;
    }
}

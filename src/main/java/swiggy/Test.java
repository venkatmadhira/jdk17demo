package swiggy;

public class Test {
    public static void main(String[] args) {
        SwiggyService swiggyService=new SwiggyService();
        try {
            swiggyService.orderFood();
        } catch (CheckedException e) {
            System.out.println(e.code+"  : "+e.getMessage());
        }


    }
}
//list of restaurants --supplier
//search restaurant---
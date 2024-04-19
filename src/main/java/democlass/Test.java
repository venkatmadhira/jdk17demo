package democlass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
public class Test {
    public static void main(String[] args) {
        Predicate<Restaurent> testing = (restaurent) -> restaurent.name.equals("Mehfil  ");
        BiPredicate<Restaurent, Boolean> testing2 = ((restaurent, aBoolean) -> restaurent.dish.equals("Biryani") && aBoolean);
        List<Restaurent> restaurentList = new ArrayList<>();
        Restaurent restaurent = new Restaurent();
        restaurent.name = "Mehfil";
        restaurent.dish = "Biryani";

        Restaurent restaurent1 = new Restaurent();
        restaurent1.name = "Pista House";
        restaurent1.dish = "Starters";
        restaurentList.add(restaurent);
        restaurentList.add(restaurent1);

        for (int i = 0; i < restaurentList.size(); i++) {
                Restaurent restaurent2 = restaurentList.get(i);

                System.out.println(restaurent2);
            }
        Iterator<Restaurent> iterator = restaurentList.iterator();
        for (;iterator.hasNext();){
            Restaurent restaurent3=iterator.next();
            if(testing2.test(restaurent3,testing.test(restaurent))){
                System.out.println(restaurent3);
            }
        }
        restaurentList.forEach(restaurent3-> {
            System.out.println("Consumer " +restaurent3);
        });
    }
}

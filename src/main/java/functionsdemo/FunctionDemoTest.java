package functionsdemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {

    Function<String,String> function=(fullName)->{
        return fullName.toUpperCase();
    };

    BiFunction<Integer,Integer,Double> biFunction=(firstAmount,lastAmount)->{
        double finalAmount=firstAmount+lastAmount;
        System.out.println(finalAmount);
        return finalAmount;
    };
    BiFunction<String,String,Integer> biFunction1=(firstName,lastName)->{
        String lengthString=firstName+lastName;
        int length= lengthString.length();
        System.out.println(length);
        return length;
    };
    public String concatName(String firstName,String lastName){
        String fullName=firstName+lastName;
        System.out.println(fullName);
        return fullName;
    }
    public static void main(String[] args){
        FunctionDemoTest test=new FunctionDemoTest();
        test.concatName("Neo","Teric");
        test.biFunction.apply(123,456);
        System.out.println();
        test.biFunction1.apply("Neo","Teric");
        String outPut=test.function.apply("Neoteric");
        System.out.println(outPut );
    }
}

package page;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DataService {
    public List<String> getNames(){
        List<String> nameList=new ArrayList<>();
        for(int i=0;i<101;i++){
            nameList.add(String.valueOf(i));
        }return nameList;
    }
//    Supplier<List<String>> getNames = () -> {
//            List<String> nameList=new ArrayList<>();
//            for(int i=1;i<101;i++){
//                nameList.add(String.valueOf(i));
//            }
//        return nameList;
//    };
//    public void supplierParameterTest(Supplier<List<String>> supplier){
//        //these are functional interfaces and there are multiple interfaces like Supplier, Consumer, Function .
//        //Functional Programming.
    //predicate
//    }

}

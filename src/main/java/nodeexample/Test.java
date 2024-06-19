package nodeexample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        NodeExample a=new NodeExample();
        List<NodeExample> aChilds=new ArrayList<>();
        a.name="A";
        NodeExample b=new NodeExample();
        NodeExample c=new NodeExample();
        aChilds.add(b);
        aChilds.add(c);
        a.child=aChilds;
        System.out.println(a);


    }
}

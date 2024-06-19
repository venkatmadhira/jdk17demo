package nodeexample;

import java.util.List;

public class NodeExample{

    public String name;
    public List<NodeExample> child;

    @Override
    public String toString() {
        return "NodeExample{" +
                "name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}

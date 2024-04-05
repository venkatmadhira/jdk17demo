package newdemo;
import java.util.ArrayList;
import java.util.List;

public class Clothing {

    private String type;
    private List<String> availableColors;

    public Clothing(String type) {
        this.type = type;
        this.availableColors = new ArrayList<>();
    }

    public void color(String color) {
        availableColors.add(color);
    }

    public boolean colorAvailable(String color) {
        return availableColors.contains(color);
    }

    public String getType() {
        return type;
    }
}

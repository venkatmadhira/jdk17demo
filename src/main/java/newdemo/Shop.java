package newdemo;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Clothing> clothes;

    public Shop() {
        this.clothes = new ArrayList<>();
    }
    public void clothing(Clothing clothing) {
        clothes.add(clothing);
    }
    public boolean colorAvailable(String type, String color) {
        for (Clothing clothing : clothes) {
            if (clothing.getType().equals(type)) {
                return clothing.colorAvailable(color);
            }
        }
        return false;
    }
}

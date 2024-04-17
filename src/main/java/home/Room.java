package home;

import java.util.ArrayList;
import java.util.List;

public class Room {
    List<Light> lights;
    List<Fan> fans;

    public Room() {
        this.lights = new ArrayList<>();
        this.fans =new ArrayList<>();
    }
}

package car;

import java.util.ArrayList;
import java.util.List;

public class CarDetails {
    public Engine engine;
    public List<Wheel> noOfWheels;
    public Tank tank;

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getNoOfWheels() {
        return noOfWheels;
    }

    public Tank getTank() {
        return tank;
    }

    public CarDetails() {
        this.noOfWheels = new ArrayList<>();
    }
}

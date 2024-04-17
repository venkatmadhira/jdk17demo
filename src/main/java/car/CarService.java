package car;

public class CarService {
    public CarDetails getCar() {
        CarDetails c = new CarDetails();
        Engine engine=new Engine();
        Tank tank=new Tank();
        Fuel fuel=new Fuel();
        Wheel wheel=new Wheel();

        fuel.type="Petrol";
        fuel.noOfLiters=35;

        tank.capacity=12;
        tank.fuel=fuel;

        engine.model="1000-CC";
        engine.fuel=fuel;

        wheel.brand="Apollo";
        wheel.type="Tube";

        c.tank=tank;
        c.engine=engine;
        c.getNoOfWheels().add(wheel);



        return c;
    }
}

package immmutable;

public class HarrierCar {
    private String color;
    private String dashBoard;
    private String wheel;
    private String engine;

    public HarrierCar(String color, String dashBoard, String wheel, String engine) {
        this.color = color;
        this.dashBoard = dashBoard;
        this.wheel = wheel;
        this.engine = engine;
    }

    public HarrierCar(String color, String dashBoard, String wheel) {
        this(color,dashBoard,wheel,"2000");
    }

    @Override
    public String toString() {
        return "HarrierCar{" +
                "color='" + color + '\'' +"\n"+
                " dashBoard='" + dashBoard + '\'' +
                ", wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HarrierCar car=new HarrierCar("Red","New","Alloy");
        System.out.println(car);
    }
}

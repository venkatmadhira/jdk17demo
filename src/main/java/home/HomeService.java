package home;

public class HomeService {

    public Home getHome(){
        Home home=new Home();

        Fan fan= new Fan();
        fan.fanType="Celing Fan";

        Furniture sofa=new Furniture();
        sofa.furnitureType="Sofa";

        Gas gas=new Gas();

        Tv tv = new Tv();

        Hall hall= new Hall();
        hall.tv=tv;

        Kitchen kitchen=new Kitchen();
        kitchen.gas=gas;

        Light light= new Light();

        Room room= new Room();
        room.fans.add(fan);
        room.lights.add(light);

        Furniture dressingTable=new Furniture();
        sofa.furnitureType="Dressing Table";

        BedRoom bedRoom=new BedRoom();
        bedRoom.tv=tv;
        bedRoom.furniture=dressingTable;

        home.rooms.add(bedRoom);
        home.rooms.add(kitchen);
        home.rooms.add(hall);

        return home;
    }
}

package practice_session.oop.abstraction;

public class VehicleTester {
    public static void main(String[] args) {
//        Vehicle car = new Vehicle("Rav4");    //Abstract class object can't be instantiated
//        car.drive();

        Vehicle car = new Toyota("RAv4");
        car.drive();
        car.getName();
        car.playMusic();

        Vehicle car2 = new Honda("Accord");
        car2.playMusic();
        car2.getName();
        car2.drive();



    }
}

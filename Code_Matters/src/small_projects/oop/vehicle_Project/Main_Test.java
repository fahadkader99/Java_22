package small_projects.oop.vehicle_Project;

public class Main_Test {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Rav4", "Blue", "2021", "Toyota","2000");

        System.out.println(v1.getColor());
        v1.setName("Honda");
        v1.setName("RAV4");
        System.out.println(v1.getName());
        System.out.println(v1.getSpeed());


        Vehicle v2 = new Vehicle();
        System.out.println();
        System.out.println(Vehicle.getCount());

        System.out.println(Vehicle.getVehicle());



    }
}

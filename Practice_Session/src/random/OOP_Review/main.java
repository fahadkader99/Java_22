package random.OOP_Review;
// https://www.youtube.com/watch?v=T60YnN_Zmn8&t=81s

public class main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Rav4", "Blue", "2021", "Toyota","2500");
        Vehicle vehicle2 = new Vehicle("Civic", "Black", "2021", "Honda", "2000");

        vehicle1.setColor("Midnight Blue");
        System.out.println(vehicle1.getColor());

        System.out.println(vehicle1.getSpeed());


    }
}

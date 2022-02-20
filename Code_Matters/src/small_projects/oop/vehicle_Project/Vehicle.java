package small_projects.oop.vehicle_Project;
// https://www.youtube.com/watch?v=T60YnN_Zmn8&t=527s

public class Vehicle {

    private String name = "";
    private String color = "";
    private String model = "";
    private String company = "";
    private String engine = "2500";
    public static int count = 0;

    public Vehicle() {
        count++;
        System.out.println("\nVehicle No: "+count);
    }

    public Vehicle(String name, String color, String model, String company,String engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
        System.out.println("\nVehicle No: "+count);
    }

    /*we use setter and getter because, lets say we already assign value by using constructor, but later
     * we want to change those value or get them then we will use setter or getter*/

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    // getters:


    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public String getCompany() {
        return this.company;
    }
    private String getEngine(){
        return this.engine;
    }

    public int getSpeed(){
        String a = getEngine();
        if (a=="800"){
            return 90;
        }else {
            return 120;
        }
    }


    public static int getCount(){
        return count;               // static is a class level variable and to access them, we do not need instance of the object., directly call by using class.
    }
    public static String getVehicle(){      // static is a class level variable
        return "you have set the name and color of the vehicle";
    }









}

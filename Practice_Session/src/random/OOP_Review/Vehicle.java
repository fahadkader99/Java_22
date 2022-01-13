package random.OOP_Review;

public class Vehicle {
   private String name = "";
   private String color = "";
   private String model = "";
   private String company = "";
   private String engine = "2500";

   public Vehicle(){ }   //  default constructor

   public Vehicle(String name, String color, String model, String company, String engine){     // Parameterized constructor
       this.name = name;
       this.color = color;
       this.model = model;
       this.color = color;
       this.engine = engine;
   }    // we have constructor overloading

   public void setName(String name){        // setter.
       this.name= name;
   }
   public void setColor(String color){      // not a good practice to access class level variable directly, we need to use setter and getter.
       this.color = color;
   }
   public void setModel(String model){
       this.model = model;
   }
   public void setCompany(String model){
       this.model = model;
   }
   public void setEngine(String engine){
       this.engine = engine;
   }


    public String getName() {       // getter
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }
    private String getEngine(){
       return engine;
    }
    public int getSpeed(){
       String a = getEngine();
       if(a == "2500"){
           return 120;
       }else return 90;

    }
}

package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;
class Cricketer3{
    String cname;
    int total_run;
    int total_match;

    double calculateAvg(){        // we are changing the return type and i want to use the value, it is returning value
        double avg = (double) total_run / total_match;
        // By using method, even if we have 100 object, we can call them by adding this method, and it will do the calculation
        return avg;
    }

}



public class CricketerDemo3 {
    public static void main(String[] args) {

        System.out.println("Cricketer-1");
        Cricketer3 rohit = new Cricketer3();  // rohit is an object & by using obj we can access instance variable
        rohit.cname = "Rohit Sharma";        // we can also use constructor to initialize these variable
        rohit.total_run = 4689;
        rohit.total_match = 89;
        System.out.println(rohit.cname+ " Avg "+ rohit.calculateAvg());

        System.out.println("\nCricketer-2");
        Cricketer3 virat = new Cricketer3();
        virat.cname = "Virat Kholi";
        virat.total_run = 6108;
        virat.total_match = 102;
        System.out.println(virat.cname+ " Avg "+ virat.calculateAvg());

    }
}

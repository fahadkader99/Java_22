package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;

class Cricketer2{
    String cname;
    int total_run;
    int total_match;

    void calculateAvg(){        // this method printing the value on console
        double avg = (double) total_run / total_match;
        System.out.println(cname + " Avg : "+ avg);
        // By using method, even if we have 100 object, we can call them by adding this method, and it will do the calculation

    }

}



public class CricketerDemo2 {
    public static void main(String[] args) {

        System.out.println("Cricketer-1");
        Cricketer2 rohit = new Cricketer2();  // rohit is an object & by using obj we can access instance variable
        rohit.cname = "Rohit Sharma";        // we can also use constructor to initialize these variable
        rohit.total_run = 4689;
        rohit.total_match = 89;
        rohit.calculateAvg();       // here we are calling the method

        System.out.println("\nCricketer-2");
        Cricketer2 virat = new Cricketer2();
        virat.cname = "Virat Kholi";
        virat.total_run = 6108;
        virat.total_match = 102;
        virat.calculateAvg();           // we are calling the method for calculation > so method can be used to shorten the code/ less repetition

    }
}

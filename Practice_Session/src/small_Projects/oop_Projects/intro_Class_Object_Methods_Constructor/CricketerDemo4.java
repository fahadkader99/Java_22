package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;
class Cricketer4{
    String cname;
    int total_run;
    int total_match;
    static int count=1;

    void setCricketer(String name, int runs, int matches){  // after creating this constructor, my code is reduced
        cname = name;
        total_run = runs;
        total_match = matches;
    }


    double calculateAvg(){        // we are changing the return type and i want to use the value, it is returning value
        count++;
        double avg = (double) total_run / total_match;
        // By using method, even if we have 100 object, we can call them by adding this method, and it will do the calculation
        return avg;
    }


}



public class CricketerDemo4 {
    public static void main(String[] args) {

        System.out.println("Cricketer-# " + Cricketer4.count);
        Cricketer4 rohit = new Cricketer4();  // rohit is an object & by using obj we can access instance variable
        rohit.setCricketer("Rohit sharma", 4689, 89);

        System.out.println(rohit.cname+ " Avg "+ rohit.calculateAvg());

        System.out.println("\nCricketer-# " + Cricketer4.count);
        Cricketer4 virat = new Cricketer4();
        virat.setCricketer("Virat kholi", 6108, 102);

        System.out.println(virat.cname+ " Avg "+ virat.calculateAvg());

        System.out.println("\nCricketer-# "+ Cricketer4.count);
        Cricketer4 kader = new Cricketer4();

        kader.setCricketer("Fahad Kader", 10000, 100);
        System.out.println(kader.cname+ " Avg "+ kader.calculateAvg());


    }
}

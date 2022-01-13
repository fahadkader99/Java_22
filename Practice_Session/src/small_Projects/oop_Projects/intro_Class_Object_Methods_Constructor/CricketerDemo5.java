package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;
class Cricketer5{
    String cname;
    int total_run;
    int total_match;
    static int count=1;

    void setCricketer(String cname, int total_run, int total_match){  // after creating this constructor, my code is reduced
        this.cname = cname;
        this.total_run = total_run; // by using this keyword, i don't have to write the 2 different var, i can write the same name in the formal parameter
        this.total_match = total_match;
        // now 2 have 2 variable, this.name > Instance var & name is formal parameter.

    }


    double calculateAvg(){        // we are changing the return type and i want to use the value, it is returning value
        count++;
        double avg = (double) total_run / total_match;
        // By using method, even if we have 100 object, we can call them by adding this method, and it will do the calculation
        return avg;
    }


}



public class CricketerDemo5 {
    public static void main(String[] args) {

        System.out.println("Cricketer-# " + Cricketer5.count);
        Cricketer5 rohit = new Cricketer5();  // rohit is an object & by using obj we can access instance variable
        rohit.setCricketer("Rohit sharma", 4689, 89);

        System.out.println(rohit.cname+ " Avg "+ rohit.calculateAvg());

        System.out.println("\nCricketer-# " + Cricketer5.count);
        Cricketer5 virat = new Cricketer5();
        virat.setCricketer("Virat kholi", 6108, 102);

        System.out.println(virat.cname+ " Avg "+ virat.calculateAvg());

        System.out.println("\nCricketer-# "+ Cricketer5.count);
        Cricketer5 kader = new Cricketer5();

        kader.setCricketer("Fahad Kader", 10000, 100);
        System.out.println(kader.cname+ " Avg "+ kader.calculateAvg());


    }
}

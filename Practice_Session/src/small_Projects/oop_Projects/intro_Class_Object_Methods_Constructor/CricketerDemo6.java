package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;
class Cricketer6{
    String cname;
    int total_run;
    int total_match;
    static int count=1;

    Cricketer6(String cname, int total_run, int total_match){   // using constructor instead of method for initialization
        this.cname = cname;
        this.total_run= total_run;
        this.total_match = total_match;
    }
//   Cricketer6(){
//       cname = "Sachin";
//       total_run = 20000;
//       total_match = 390;
//   }

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



public class CricketerDemo6 {
    public static void main(String[] args) {

//        System.out.println("\nCricketer-# " + Cricketer6.count);
//        Cricketer6 rohit = new Cricketer6();  // rohit is an object & by using obj we can access instance variable
//        rohit.setCricketer("Rohit sharma", 4689, 89);
//        System.out.println(rohit.cname+ " Avg "+ rohit.calculateAvg());
//
//        System.out.println("\nCricketer-# " + Cricketer6.count);
//        Cricketer6 virat = new Cricketer6();
//        virat.setCricketer("Virat kholi", 6108, 102);
//        System.out.println(virat.cname+ " Avg "+ virat.calculateAvg());
//
//        System.out.println("\nCricketer-# "+ Cricketer6.count);
//        Cricketer6 kader = new Cricketer6();
//        kader.setCricketer("Fahad Kader", 10000, 100);
//        System.out.println(kader.cname+ " Avg "+ kader.calculateAvg());

        System.out.println("\nCricketer-# " + Cricketer6.count);
        Cricketer6 sachin = new Cricketer6("Jahan", 5000, 50);
        System.out.println( sachin.cname +" Avg "+sachin.calculateAvg());


    }
}

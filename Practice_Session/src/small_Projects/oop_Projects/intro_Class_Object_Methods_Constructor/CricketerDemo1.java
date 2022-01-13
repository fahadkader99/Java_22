package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;
// https://www.youtube.com/watch?v=pmkP7B1iFcg&list=PLATOxdAcWIvNXvfmJI_HOcTRWC9buuFV4&index=25
// oop concept project.

class Cricketer{
    String cname;       // all are instance variable
    int total_runs;
    int total_matches;
}

class CricketerDemo{
    public static void main(String[] args) {
        System.out.println("Cricketer-1");
        Cricketer rohit = new Cricketer();  // rohit is an object & by using obj we can access instance variable
        rohit.cname= "Rohit Sharma";        // we can also use constructor to initialize these variable
        rohit.total_runs = 4689;
        rohit.total_matches = 89;
        double agv = (double) rohit.total_runs / rohit.total_matches;   // casting, because container is primitive and we are working with reference data type
        System.out.println("Average = "+ agv);

        System.out.println("\nCricketer-2");
        Cricketer virat = new Cricketer();
        virat.cname = "Virat Kholi";
        virat.total_runs = 6108;
        virat.total_matches= 102;
        double avg2 = virat.total_runs / virat.total_matches;
        System.out.println("Avg = "+ avg2);
    }
}
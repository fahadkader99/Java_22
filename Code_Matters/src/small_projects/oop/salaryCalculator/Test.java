package small_projects.oop.salaryCalculator;

public class Test {
    public static void main(String[] args) {

       // creating array of objects
        Employee employee[] = new Employee[3];

        employee[0] = new HourlyEmployed(1, "Ash","kader", 40, 20);
        employee[1] = new SalariedEmployee(2,"Esrat","Jahan", 5000);
        employee[2] = new CommissionedEmployee(3,"Sania","Jahan", 0.5,2000,50000);


        // calling toString method to display all the information

        for (int i = 0; i < employee.length;i++){
            System.out.println(employee[i]);
            System.out.println("\n");
        }




    }
}

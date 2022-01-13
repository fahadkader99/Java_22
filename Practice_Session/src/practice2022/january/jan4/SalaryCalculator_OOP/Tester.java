package practice2022.january.jan4.SalaryCalculator_OOP;

//https://www.youtube.com/watch?v=m57dYq5x0lo

public class Tester {
    public static void main(String[] args) {

        //  Create an array of object--

        Employee employee[] = new Employee[3];
       employee[0] = new HourlyEmployee(1,"Ash", "Kader", 45, 19.95);
       employee[1] = new SalariedEmployee(2, "Maria", "Smith", 70000);
       employee[2] = new CommissionEmployee(3, "Zack", "Lee", 0.05, 2000, 50000);

       // Now we call the toString function to see the details

        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i]);
            System.out.println("\n");
        }

    }
}

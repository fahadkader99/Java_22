package practice2022.january.jan4.SalaryCalculator_OOP;

public class SalariedEmployee extends Employee{

    private  double baseSalary;

    public SalariedEmployee(){      // default constructor calling the super.
        super();
    }

    /**
     * Initialized Salaried employee from given parameters.
     *
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param baseSalary
     */
    public SalariedEmployee(int employeeId, String firstName, String lastName,  double baseSalary){
        super(employeeId, firstName, lastName);
        this.baseSalary = baseSalary;
    }

    // Getter for local variable

    public double getBaseSalary(){
        return baseSalary;
    }

    // Setter for local variable

    public void setBaseSalary(double salary){
        this.baseSalary = salary;
    }

    //Abstract Method.
    /*
    Function to calculate salary of an employee- all the child class
    must override this method to provide Polymorphism.
                @ return salary.
     */
    @Override
    public double calculateSalary(){
        return baseSalary;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
    }

}

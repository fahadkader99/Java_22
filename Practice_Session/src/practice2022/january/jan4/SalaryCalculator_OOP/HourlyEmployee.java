package practice2022.january.jan4.SalaryCalculator_OOP;

public class  HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(){
        super();
    }

    /**
     * Parameter Constructor to instantiace HourlyEmployee Object
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param hoursWorked
     * @param hourlyRate
     */
    public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate){
        super(employeeId, firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    // Getter methods for local variable of this class
    public double getHoursWorked(){
        return hoursWorked;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }

    // Setter
    public void setHoursWorked(double hours){
        this.hoursWorked=hours;
    }
    public void setHourlyRate(double rate){
        this.hourlyRate = rate;
    }

    //Abstract Method.
    /*
    Function to calculate salary of an employee- all the child class
    must override this method to provide Polymorphism.
                @ return salary.
     */
    @Override
    public double calculateSalary(){
        double salary = 0;
        double overtime = 0;

        if (hoursWorked > 40){
            double hours = hoursWorked - 40;
            hoursWorked = 40;
            overtime = hours * (hourlyRate * 1.5);
        }

        salary = hoursWorked * hourlyRate;
        salary += overtime;

        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
    }


}

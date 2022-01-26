package small_projects.oop.salaryCalculator;

public class HourlyEmployed extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployed(){
        super();
    }

    /**
     * parameter constructor to instantiate HourlyEmployee obj
     *
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param hoursWorked
     * @param hourlyRate
     */
    public HourlyEmployed(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate){
        super(employeeId,firstName,lastName);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;

    }

    @Override
    public double calculateSalary(){

        double salary = 0;
        double overtime = 0;

        if (hoursWorked>40){
            double hours = hoursWorked-40;
            hoursWorked = 40;
            overtime = hours*(hourlyRate*1.5);
        }
        salary = hoursWorked *hourlyRate;
        salary += overtime;
        return salary;
    }


    @Override
    public String toString(){
        return super.toString()+
        String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
    }

    // getter methods for local variable for this class
    public double getHoursWorked(){
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // setter for local variable

    public void setHoursWorked(double hours){
        this.hourlyRate=hours;
    }
    public void setHourlyRate(double rate){
        this.hourlyRate=rate;
    }

}

package practice2022.january.jan4.SalaryCalculator_OOP;

public class CommissionEmployee extends Employee{

    private double commissionRate;
    private double baseSalary;
    private double totalSales;

    public CommissionEmployee(){        //default constructor
        super();
    }

    /**
     * Parameter constructor
     *
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param commissionRate
     * @param baseSalary
     * @param totalSales
     */
    public CommissionEmployee(int employeeId, String firstName, String lastName, double commissionRate, double baseSalary, double totalSales){
        super(employeeId, firstName, lastName);
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }

    // Getter methods
    public double getCommissionRate(){
        return commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }

    // Setter methods
    public void setCommissionRate(double rate){
        this.commissionRate = rate;
    }
    public void setBaseSalary(double salary){
        this.baseSalary = salary;
    }
    public void setTotalSales(double sales){
        this.totalSales = sales;
    }

    // Calculate commission salary Method
    public double calculateCommission(){
        return totalSales * commissionRate;
    }

    //Abstract Method.
    /*
    Function to calculate salary of an employee- all the child class
    must override this method to provide Polymorphism.
                @ return salary.
     */
    @Override
    public double calculateSalary(){
        return calculateCommission() + baseSalary;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
    }

}

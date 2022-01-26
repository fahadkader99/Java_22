package small_projects.oop.salaryCalculator;

public class CommissionedEmployee extends Employee{
    private double commissionRate;
    private double baseSalary;
    private double totalSales;

    public CommissionedEmployee(){
        super();
    }
    public CommissionedEmployee(int employeeId, String firstName, String lastName, double commissionRate, double baseSalary, double totalSales){
        super(employeeId, firstName, lastName);
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }


    @Override
    public double calculateSalary(){
        return calculateCommission()+ baseSalary;
    }


    @Override
    public String toString(){
        return super.toString()+
                String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
    }

    public double calculateCommission(){
        return totalSales* commissionRate;
    }

    // setter and getter


    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

}

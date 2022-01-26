package small_projects.oop.salaryCalculator;

public abstract class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;

    public Employee(){  // default constructor

    }
    public Employee(int employeeId, String firstName, String lastName){     // parameterized constructor
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;

    }

    // getter

    public int getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
     return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    // setter
    public void setEmployeeId(int id){
        this.employeeId=id;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName=name;
    }

    // Abstract method

    /**
     * function to calculate salary of an employee- All the child class
     * must override this function
     * @return salary
     */
    public abstract double calculateSalary();

    @Override
    public String toString(){
        return  String.format("%-20s %s%n", "Employee ID: ", employeeId)+
                String.format("%-20s %s%n", "Employee Name: ",firstName+" "+lastName );
    }
}

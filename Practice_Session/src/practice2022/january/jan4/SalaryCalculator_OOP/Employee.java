package practice2022.january.jan4.SalaryCalculator_OOP;
//https://www.youtube.com/watch?v=m57dYq5x0lo

public abstract class  Employee {

    // Fields
    private int employeeId;
    private String firstName;
    private String lastName;

    // default constructor
    public Employee(){

    }

    /**
     *  // Parameterized constructor
     * @param employeeId
     * @param firstName
     * @param lastName
     */
    public Employee(int employeeId, String firstName, String lastName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public int getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    // Setter methods
    public void setEmployeeId(int id){
        this.employeeId = id;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }

    //Abstract Method.
    /*
    Function to calculate salary of an employee- all the child class
    must override this method to provide Polymorphism.
                @ return salary.
     */
    public abstract double calculateSalary();

    @Override
    public String toString(){

        return String.format("%-20s %d%n", "Employee ID: ", employeeId)+
                String.format("%-20s %s%n", "Employee Name: ", firstName+ " "+ lastName);

    }



}

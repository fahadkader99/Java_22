package small_Projects.oop_Projects.intro_Class_Object_Methods_Constructor;

// so when private modifier is used, we c/an go around using the  method or public setter.
class Employee{
    private String name;    // using private means encapsulation
    private int num;        // when it is privet, outsider class can not access the var
    private int salary;     //

    Employee(){}    // default constructor.

    Employee(String name, int num, int salary) {         // parameterized constructor
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    void showEmployee(){
        System.out.println("Name: "+ name+ " \nID: "+ num+ " \nSalary: "+ salary );
    }
// let's say user want to change the salary, but nothing else.

    public void setSalary(int salary){
        this.salary= salary;
    }

}



public class EmployeeDemo {
    public static void main(String[] args) {

        Employee a = new Employee("Fahad", 10, 500);
       // System.out.println(a.name+ " "+ a.num+ " "+ a.salary); // these are not accessible because of private Acc modifier
        a.showEmployee();   // all the variable/ data are protected and secure and unchangeable
        a.setSalary(600);   // this is the only way user can modify the variable data by using setter, even though the data is in private modd.
        a.showEmployee();

    }
}

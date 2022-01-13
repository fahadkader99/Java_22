package small_Projects.collection_Project;
// https://www.youtube.com/watch?v=O-XrUJj83E0&t=372s
// CRUD operation of employee collection.

import java.util.*;

class Employee{
    private int num;
    private String name;
    private int salary;

    Employee(int num, String name, int salary){
        this.num = num;
        this.name = name;
        this.salary  = salary;
    }
    public int getNum(){    // using getters since out data type is private and they are not open to other class.
        return num;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public String toString(){
        return num+" "+ name+ " "+ salary;
    }
}




public class CRUD_Operation_Collection {
    public static void main(String[] args) {
        int choice;

        List<Employee> c = new ArrayList<Employee>();

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);    // using 2 scanner instance coz it will not create confusion while taking input
        do {

            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:         // Insert.
                    System.out.print("Enter Employee Num: ");
                    int n = input.nextInt();
                    System.out.print("Enter Employee name: ");
                    String nm = input1.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    int s = input.nextInt();

                    c.add(new Employee(n, nm, s));  // here all the data from the input is saving in the collection and, new object are created.
                    break;

                case 2:     // Display
                    System.out.println("---------------------------------------------");  // when user press 2 it will display the collection.
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------------------------------");
                    break;

                case 3:     // Searching
                    boolean found = false;
                    System.out.println("Enter Num to search: ");
                    int empno = input.nextInt();
                    System.out.println("---------------------------------------------");
                    i = c.iterator();   // Iterator has been declared already in previous case
                    while (i.hasNext()){
                        Employee e = i.next();
                        if (e.getNum() == empno){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found! ");
                    }
                    System.out.println("---------------------------------------------");
                    break;

                case 4:     // Delete
                    found = false;
                    System.out.println("Enter Employee Number to Delete: ");
                    empno = input.nextInt();
                    System.out.println("---------------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        if (e.getNum()==empno){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found! ");
                    }else {
                        System.out.println("Record is Deleted Successfully...! ");
                    }
                    System.out.println("---------------------------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.println("Enter Employee Num to Update");
                    empno = input.nextInt();
                    System.out.println("---------------------------------------------");
                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()){
                        Employee e = li.next();
                        if (e.getNum()==empno){
                            System.out.println("Enter New Name: ");
                            nm = input1.nextLine();
                            System.out.println("Enter New Salary: ");
                            s = input.nextInt();
                            li.set(new Employee(empno,nm,s));
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found ");
                    }else {
                        System.out.println("Record is Updated Successfully");
                    }
                    System.out.println("---------------------------------------------");
                    break;




            }

        }while (choice!= 0);
    }
}

package small_Projects.collection_Project.Crud_Project;

import java.util.*;

public class Employee {
    private int eno;
    private String ename;
    private int salary;

    Employee(int eno, String ename, int salary) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmployee() {
        return eno;
    }

    public int getSalary() {
        return salary;
    }

    public String getEname() {
        return ename;
    }

    public String toString() {
        return eno + " " + ename + " " + salary;
    }
}

class CRUDDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner q = new Scanner(System.in);

        List<Employee> c = new ArrayList<Employee>();

        int choice;

        try {
            do {
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Search");
                System.out.println("4. Delete");
                System.out.println("5. Update");
                System.out.println("0. End the Program !");
                System.out.println("Enter your choice: ");
                choice = s.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Emp No. ");
                        int eno = s.nextInt();
                        System.out.print("Enter Emp Name: ");
                        String ename = q.nextLine();
                        System.out.print("Enter Emp Salary: ");
                        int salary = s.nextInt();
                        c.add(new Employee(eno, ename, salary));
                        break;

                    case 2:
                        System.out.println("-----------------------------------------");
                        Iterator<Employee> it = c.iterator();
                        while (it.hasNext()) {
                            Employee e = it.next();
                            System.out.println(e);
                        }
                        System.out.println("-----------------------------------------");
                        break;

                    case 3:
                        boolean found = false;
                        System.out.println("Enter Emp No to search: ");
                        eno = s.nextInt();
                        System.out.println("-----------------------------------------");
                        it = c.iterator();
                        while (it.hasNext()) {
                            Employee e = it.next();
                            if (e.getEmployee() == eno) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found...! ");
                        }
                        System.out.println("-----------------------------------------");
                        break;

                    case 4:
                        boolean found1 = false;
                        System.out.println("Enter Emp No to delete: ");
                        eno = s.nextInt();
                        System.out.println("-----------------------------------------");
                        it = c.iterator();
                        while (it.hasNext()) {
                            Employee e = it.next();
                            if (e.getEmployee() == eno) {
                                it.remove();
                                System.out.println("Record Deleted Successfully. ");
                                found1 = true;
                            }
                        }
                        if (!found1) {
                            System.out.println("Record not found !");
                        }
                        System.out.println("-----------------------------------------");
                        break;

                    case 5:
                        found = false;
                        System.out.println("Enter Emp No. to update: ");
                        eno = s.nextInt();
                        System.out.println("-----------------------------------------");
                        ListIterator<Employee> li = c.listIterator();
                        while (li.hasNext()) {
                            Employee e = li.next();
                            if (e.getEmployee() == eno) {
                                System.out.println("Enter New Name: ");
                                ename = q.nextLine();

                                System.out.println("Enter New Salary: ");
                                salary = s.nextInt();

                                li.set(new Employee(eno, ename, salary));
                                found = true;
                            }
                        }
                        if (found) {
                            System.out.println("Record Updated Successfully.");
                        } else {
                            System.out.println("Record Not Found..!");
                        }
                        System.out.println("-----------------------------------------");
                        break;

                    case 0:
                        System.out.println("-----------------------------------------");
                        System.out.println("<<< Good Bye >>> ");
                        System.out.println("-----------------------------------------");
                        break;

                }


            } while (choice != 0);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exception Detected. Try Again.");
        }
    }
}

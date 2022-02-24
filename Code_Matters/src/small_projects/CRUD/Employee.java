package small_projects.CRUD;

// crud operation by Dr. Parag Sukla

import java.util.*;

public class Employee {
    private int emno;
    private String ename;
    private int salary;

    Employee(int emno, String ename, int salary){
        this.emno = emno;
        this.ename = ename;
        this.salary = salary;

    }
    public int getEmno(){
        return emno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }
    public String toString(){
        return emno+" "+ename+" "+salary;
    }

}

class CRUDDemo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Employee> c = new ArrayList<>();

        int ch;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("Enter your Choice: ");
            ch = s.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter emp Num: ");
                    int eno = s.nextInt();
                    System.out.print("Enter emp Name: ");
                    String ename = sc.nextLine();
                    System.out.print("Enter emp Salary: ");
                    int salary = s.nextInt();

                    c.add(new Employee(eno,ename,salary));
                    break;

                case 2:
                    System.out.println("====================");
                    Iterator<Employee> it =c.iterator();
                    while (it.hasNext()){
                        Employee e = it.next();
                        System.out.println(e);
                    }
                    System.out.println("====================");
                    break;

                case 3:

                    boolean found = false;
                    System.out.println("Enter emp num to search: ");
                    System.out.println("-----------------------------");
                    eno = s.nextInt();
                    it = c.iterator();
                    while (it.hasNext()){
                        Employee e = it.next();
                        if (e.getEmno()==eno){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found...!");
                    }
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.println("Enter emp num to delete: ");
                    eno = s.nextInt();
                    System.out.println("-----------------------------");
                    it = c.iterator();
                    while (it.hasNext()){
                        Employee e = it.next();
                        if (e.getEmno()== eno){
                            it.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found. Can't Delete ...!");
                    }else System.out.println("Record is Deleted Successfully.");
                    System.out.println("-----------------------------");
                    break;


                case 5:
                    found = false;
                    System.out.println("Enter emp num to update: ");
                    eno = s.nextInt();
                    System.out.println("-----------------------------");
                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()){
                        Employee e = li.next();
                        if (e.getEmno() == eno){
                            System.out.println("Enter the new Name: ");
                            ename = sc.nextLine();

                            System.out.println("Enter new Salary: ");
                            salary = s.nextInt();

                            li.set(new Employee(eno,ename,salary));
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Recorde not found...!");
                    }else System.out.println("Record is Updated.");
                    System.out.println("-----------------------------");

            }








        }while (ch!= 0);
        s.close();
        sc.close();

    }
}

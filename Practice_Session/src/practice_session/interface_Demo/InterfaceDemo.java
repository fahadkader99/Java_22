package practice_session.interface_Demo;

import java.util.Scanner;
// develop an interface which takes username and salary and outputs.

interface client{
    void input(); // by default this method is public + abstract.
    void output(); // by default this method is public + abstract.


}

class Developer implements client{
    String name;
    double salary;


    public void input(){    // access modifier of the client method is public, so it has to be public as well.

        Scanner r = new Scanner(System.in);
        System.out.println("Enter username: ");
        name = r.nextLine();

        System.out.println("Enter salary: ");
        salary = r.nextInt();
    }
    public void output(){   // must be public since the interface method is public by default
        System.out.println("\nName: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        client c = new Developer();
        c.input();
        c.output();

    }
}


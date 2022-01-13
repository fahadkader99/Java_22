package practice_session.oop.constructor.ParameterAndNoArgsConstructor;

public class Teacher {
    String name;
    char gender;
    int age;
    int phone;
    double salary;

    Teacher(){      // No args constructor / default constructor if i delete it.
        System.out.println("No value -> No args constructor");
    }


    Teacher(String n, char g, int a){      // constructor to initialize
        System.out.println("General Info:");
        name = n;
        gender = g;
        age = a;

    }

    Teacher(int ph, double s){                  // 2nd constructor
        System.out.println("Private Info: ");
        phone = ph;
        salary = s;
    }

    void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age: "+ age);
        System.out.println("Phone: "+ phone);
        System.out.println("Salary: "+ salary);
        System.out.println("\n");
    }


}

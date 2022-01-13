package small_Projects.oop_Projects.ParameterizedMethod;

public class Teacher {

    String name;
    char gender;
    int age;


     void setInfo(String n, char g, int a){        // passing the parameters
         name = n;               // assigning the parameters
        gender = g;
        age = a;

     }

      void displayInfo(){    // this method is for writing less code and using them many times.

         System.out.println("Name: "+ name);
         System.out.println("Gender: "+ gender);
         System.out.println("Age: "+ age);
     }


}

package practice_session.oop.constructor.Overloading;

public class Teacher {          // overloading constructor is when the name are same but the parameter passed are different
    String name;
    String gender;
    int phone;

    Teacher(){
        System.out.println("Default Constructor / No Info \n");
    }
    Teacher(String n, String g){
        name = n;
        gender = g;
    }
    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
        System.out.println("\n");
    }

}

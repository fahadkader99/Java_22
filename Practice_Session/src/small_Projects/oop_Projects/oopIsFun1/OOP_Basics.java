package small_Projects.oop_Projects.oopIsFun1;

import small_Projects.oop_Projects.oopIsFun1.encapsulation.EncapsulationIntro;

class Notes{
    /**
     * in java one file there can be only one Public class.
     * Public class name and the file name has to be same.
     *
     */
}
public class OOP_Basics {
    //https://www.youtube.com/watch?v=a199KZGMNxk
    //Java OOPs Concepts in just 60 minutes
    public static void main(String[] args) {

//        // Parent class
//        Person p1 = new Person("Fahad", 29);
//        p1.printInfo();
//
//        System.out.println();
//
//        // Developer class
//        Developer d1 = new Developer("Urmy", 27);
//
//        d1.walk();
//        d1.walk(10);
//        d1.walk();
//        System.out.println();
//
//        // Automation class
//        Automation a1 = new Automation("Jahan", 20);
//        a1.printInfo();
//        a1.walk();
        EncapsulationIntro a = new EncapsulationIntro();


    }
}


class Person{
    String name;
    int age;
    static int count;

    public Person(){

        count++;    // count is updating everytime creating new object so it needs to be static or non-static will create new obj everytime with value 1
        System.out.println("Creating object # "+ count);
    }

    public Person(String name, int age){    // constructor 1
        this();
        this.name= name;
        this.age = age;
        System.out.println(name + "\n"+ age);

    }
    void printInfo(){                       // constructor 2
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }

    void walk(){    // this is Compile Time polymorphism
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps){
        System.out.println(name+" walked "+ steps + " steps");
    }

}

/* Compile time Polymorphism:
    Here in this class we have similar method with different parameter, and child/ parent class access them based
        on parameter passed.

   Run- Time Polymorphism:
    where(parent and child have the same method) parent class can't access child class new features / method but child can access parent class features.
        Java decides to go with the methods in the runtime.
 */






























































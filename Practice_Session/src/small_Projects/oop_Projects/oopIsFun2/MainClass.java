package small_Projects.oop_Projects.oopIsFun2;

//https://www.youtube.com/watch?v=a199KZGMNxk&t=544s

import small_Projects.oop_Projects.oopIsFun2.encapsule.Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name+ " # "+ p1.count);
        p1.age=20;
        p1.name = "Fahad";
        p1.walk();
        p1.walk(20);
//=======================================================
        Person p2 = new Person();
        System.out.println(p2.name+ " # "+ p2.count);
        p2.name = "Alex";
        p2.age = 30;
        p2.eat();
//=======================================================
        System.out.println(p1.name +" "+ p1.age );
        System.out.println(p2.name +" "+ p2.age );
        //=======================================================

        Person p3 = new Person("Kader", 33);
        p3.doWork();

        Developer dev = new Developer("Jahan", 22);
        dev.walk();

//        System.out.println("\nEncapsulation :");
//        Encapsulation e = new Encapsulation();
//        e.doWork();




    }
}

class Person{

    String name;
    int age;
    static int count;   // static variable belong to class

    Person(){   // constructor overloading
        count++;
        System.out.println("\nCreating New object # "+ count);
    }
    Person(String name, int age){   // constructor overloading
        this();
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){        // method overloading & compile time polymorphism.
        System.out.println(name+" walked "+ steps+ " steps");
    }
    void doWork(){
        System.out.println(name+ " is working.");
    }
}


class Developer extends Person{
     Developer(String name, int age){
         super(name, age);
     }
    void walk(){    // method overriding & run-time polymorphism
        System.out.println("Developer "+name + " is walking");
    }
}
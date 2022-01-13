package practice_session.oop.toStringMethod;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){   // toString is object class method.
        return "Name: "+ name + "\nAge: "+ age;
    }


}

package practice_session.oop.inheritance;

public class Person {
    String name;
    int age;

    void displayInfo1(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }
}
// It is better to have the properties, which will be common in the project, so that it remain easy to extend the parent class
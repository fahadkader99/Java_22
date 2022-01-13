package practice_session.oop.encapsulation;
/*Encapsulation: for this we have to declare out variable in private. And to access them from other class, we must use
Setter and getter own class to give accessibility. */
public class Person {
//    String name;    // right now they are default variable
//    int age;

    private String name;    // they are private variable, only accessible within the class
    private int age;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

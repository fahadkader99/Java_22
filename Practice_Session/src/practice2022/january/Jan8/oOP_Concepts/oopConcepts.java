package practice2022.january.Jan8.oOP_Concepts;

public class oopConcepts {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.name = "Fahad";
//        p1.age = 24;
//
        Person p2 = new Person();
//        p2.age = 30;
//        p2.name = "Anuj";
//
//        System.out.println(p1.name+" "+ p1.age);
//        p1.eat();
//        System.out.println(p2.name+" "+ p2.age);
//        p2.walk();
//        p2.walk(10);
//        System.out.println(Person.count);
        Person p3 = new Person("Fahad", 26);
        System.out.println(p3.name);
        System.out.println(p3.age);
        p3.walk();

        Developer d1 = new Developer("Kader",24);
        d1.eat();
        d1.walk(20);




    }


}

class Person{
    protected String name;
    protected int age;
    protected static int count = 0;

    public Person(){
        count++;
        System.out.println("Creating an object: "+ count);
    }
    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }
    void walk(){
        System.out.println(name+ " is walking");
        System.out.println("From Parent");
    }
    void eat(){
        System.out.println(name+" is eating");
        System.out.println("From Parent");
    }
    void walk(int steps ){      // compile time polymorphism
        System.out.println(name+" walked "+ steps +" steps");
    }
}

class Developer extends Person{

    public Developer(String name, int age){
        super(name,age);
    }

    @Override
    void walk(){
        System.out.println("Dev "+name+ " is walking");
    }
    @Override
    void eat(){
        System.out.println("Dev "+name+ " is eating");
    }

}




























































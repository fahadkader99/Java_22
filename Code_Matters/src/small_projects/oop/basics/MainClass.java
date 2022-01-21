package small_projects.oop.basics;

public class MainClass {
    public static void main(String[] args) {

//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.name = "Fahad";
//        p1.age = 21;
//        System.out.println(p1.name+" "+ p1.age);
//
//        p1.eat();
//        p1.walk(100 );
//
//        System.out.println();
//        p2.name = "Kader";
//        p2.age = 50;
//        p2.walk();
//        p2.walk(20);
        Person p1 = new Person("Fahad", 21);
        p1.eat();
        Person p2 = new Person("Kader",44);
        p2.walk(20);

        Developer d1 = new Developer("Ash",33);
        d1.walk(77);
        d1.walk();



    }
}

class Person{

    String name;
    int age;
    static int count = 0;

    public Person(){
        count++;
        System.out.println("\nCreating an Obj # "+count);
    }
    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }


    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating ");
    }
    void walk(int steps){
        System.out.println(name+" walked "+ steps+ " steps");
    }

}

class Developer extends Person{

    public Developer(String name, int age){
        super(name,age);
    }

    void walk(){
        System.out.println("Developer "+name+" is walking");
    }

}
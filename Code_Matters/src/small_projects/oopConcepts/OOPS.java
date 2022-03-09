package small_projects.oopConcepts;
// https://www.youtube.com/watch?v=bSrm9RXwBaI

class Pen {
    String color;
    String type;    // ball or gel
    static int count = 0;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


class Student {
    String name;
    int age;

    public void printInfo(String name, int age){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    Student(){
        System.out.println("\nNon- Parameterised constructor");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;

    }

    Student(Student s2){            // this is copy constructor, it is copying the constructor info to the S2 object constructor
        this.name = s2.name;
        this.age = s2.age;
    }



}

class Shape{
    String color;

    public void area(int l, int h){
        System.out.println("Printing from Shape");
        System.out.println(1/2*l*h);
    }
}

class Triangle extends Shape{

    public void area(int l, int h){
        System.out.println("Printing from Triangle");
        System.out.println("");
    }
}

class EquilateralTriangle extends Triangle{

    public void area(){
        System.out.println("Printing from Equilateral Triangle");

    }
}


public class OOPS {
    public static void main(String args []) {

//        Triangle t = new Triangle();
//        t.color = "White";
//        System.out.println(t.color);
//        t.area();

    }
}

package small_Projects.oop_Projects.oopIsFun1.inheritence;

class A8{
    void display(){
        System.out.println("A display");
    }
}

class B8 extends A8{
    void display(int num){      // method overloading || static polymorphism (same method with different parameter)
        System.out.println("B display");
    }
    void display(){
        System.out.println("B display, Method overriding");
    }
}

class C8 extends A8{
    void display(int num){
        System.out.println("C display");
    }
    void display(){
        System.out.println("B display, Method overriding");
    }
}

public class InheritanceDemo8 {
    public static void main(String[] args) {

        A8 a = new A8();
        a.display();


        A8 a1 = new B8();
        a.display();

        A8 a2 = new C8();
        a2.display();
    }
}

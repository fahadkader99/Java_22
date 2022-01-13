package small_Projects.oop_Projects.oopIsFun1.inheritence;
// Object class is super class of all the class.
class A1{

    A1(){
        System.out.println("A's constructor");
    }


}

class B1 extends A1{
    B1(){
        System.out.println("B's constructor");
    }


}

class C1 extends B1{
    C1(){
        super();
        System.out.println("C's constructor");
    }


}
// when we are calling child class constructor by using child obj, parent class constructor gets call by automatically
        // by default compiler is writing Super(); implicitly



public class InheritanceDemo2 {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}

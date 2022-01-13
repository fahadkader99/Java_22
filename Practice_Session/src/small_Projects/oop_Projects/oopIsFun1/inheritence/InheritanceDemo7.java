package small_Projects.oop_Projects.oopIsFun1.inheritence;

class A7{
    A7(){
        this(50);
        System.out.println("A's default constructor");
    }
    A7(int num){
        System.out.println("A parameterized cons "+ num);
    }
}
class B7 extends A7{
    B7(){
        this(100);
        System.out.println("B's default constructor");
    }
    B7(int num){
        super();  // A will be 20, since A is super for B
        System.out.println("B parameterized cons "+ num);
    }
}

class C7 extends B7{
    C7(){
        this(150);
        System.out.println("C's default constructor");
    }
    C7(int num){
        super();  // now B will be 10, since B is super for c.
        System.out.println("C parameterized cons "+num);
    }

}


public class InheritanceDemo7  {
    public static void main(String[] args) {

        C7 c = new C7();
        B7 b = new B7();
    }
}

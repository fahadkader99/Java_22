package small_Projects.oop_Projects.oopIsFun1.inheritence;

class A3{
    A3(){
        super();
        System.out.println("A constructor");
    }
}

class B3 extends A3{
    B3(){
        super();
        System.out.println("B constructor");
    }
}

class C3 extends B3{
    C3(){
        super();
        System.out.println("C constructor");
    }
}


public class InheritanceDemo3 {
    public static void main(String[] args) {

        C3 c = new C3();

    }
}

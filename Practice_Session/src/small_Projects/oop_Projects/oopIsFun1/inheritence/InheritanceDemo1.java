package small_Projects.oop_Projects.oopIsFun1.inheritence;
class A{
    int i, j;
    {
        i = 100;
        j = 200;
    }
    void showij(){
        System.out.println("Value of i & j "+i+ " "+ j);

    }
}

class B extends A{
    int k = 300;

    void sum(){
        System.out.println("Sum of i j k "+ (i+j+k));
    }

}





public class InheritanceDemo1 {
    public static void main(String[] args) {

        A a = new A();
        a.showij();

        B b = new B();
        b.showij();
        b.sum();

    }
}

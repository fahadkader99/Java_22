package small_Projects.oop_Projects.oopIsFun1.inheritence;

class A4{
    int i, j;
    A4(){
        i = 100;
        j = 200;
    }
}

class B4 extends A4{
    int i, j,k;
    B4(){
        i = 300;        // when same variable is available in parent and child class that is called variable shadowing
        j = 400;  // when variable is available in both class that creates amiguity
        k = 500;
    }
    void display(){
        System.out.println(i+" "+j); // here i and j printing from child class not from super class
        System.out.println(i+" " +k);
        System.out.println(super.i+" "+ super.j); // by using super we can access parent class var
    }

}

public class InheritanceDemo4 {
    public static void main(String[] args) {

        B4 b = new B4();
        b.display();

    }
}

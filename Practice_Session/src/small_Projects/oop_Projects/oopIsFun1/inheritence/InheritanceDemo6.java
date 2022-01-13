package small_Projects.oop_Projects.oopIsFun1.inheritence;

class A6{
    int i, j;
    A6(){
        i = 100;
        j = 200;
    }
    void display(){
        System.out.println("A constructor");
    }
}

class B6 extends A6{
    int i,k;
    B6(){
        i = 300;        // when same variable is available in parent and child class that is called variable shadowing
//        j = 400;  // when variable is available in both class that creates amiguity
        k = 500;
    }
    void display(){     // method riding
        System.out.println("B constructor");
    }
    void display(int i, int j, int k){      // this is method overloading
        System.out.println(i+" "+j+" "+k);    // formal input from method
        System.out.println(this.i+" "+this.j);   // current instance var
        System.out.println(super.i+" "+ super.j);   // super var
        super.display();    // it will call the super class method
        display();  // it will call the current class and if current class method no available then will call the super class
    }

}

public class InheritanceDemo6 {
    public static void main(String[] args) {

        B6 b = new B6();
        b.display(10,20,30);

    }
}

package small_Projects.oop_Projects.oopIsFun1.inheritence;
class A5{
    int i, j;
    A5(){
        i = 100;
        j = 200;
    }
}

class B5 extends A5{
    int i,k;
    B5(){
        i = 300;        // when same variable is available in parent and child class that is called variable shadowing
//        j = 400;  // when variable is available in both class that creates amiguity
        k = 500;
    }
    void display(int i, int j, int k){
        System.out.println(i+" "+j+" "+k);    // formal input from method
        System.out.println(this.i+" "+this.j);   // current instance var
        System.out.println(super.i+" "+ super.j);   // super var

    }

}

public class InheritanceDemo5 {
    public static void main(String[] args) {

        B5 b = new B5();
        b.display(10,20,30);

    }
}

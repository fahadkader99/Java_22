package practice_session.oop.interface_demo.multipleInheritance;

public class C implements A,B{

    public void play(){
        System.out.println("A , B are implemented");
    }
    public void play(int age){
        System.out.println();
    }

}

class Test{
    public static void main(String[] args) {
        C c = new C();
        c.play();
    }

}
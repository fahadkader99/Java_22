package practice_session.oop.interface_demo.interfaceFirst;

public class Dog implements Animal{
    public void eat(){
        System.out.println("Dogs are eating");
    }
}

class Cat implements Animal{
    public void sleep(){
        System.out.println( "Cats are sleeping");
    }
    public void eat(){

    }
}

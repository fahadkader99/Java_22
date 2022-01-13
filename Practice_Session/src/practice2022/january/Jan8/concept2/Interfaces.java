package practice2022.january.Jan8.concept2;

public class Interfaces implements Car1, Person2, Jahan{
    public static void main(String[] args) {

    Interfaces t = new Interfaces();
    t.start();
    t.lockWindow();
    t.walk();
    t.talk();



    }

    @Override
    public void start(){
        System.out.println("Implementing abstract method from interface");
    }

    @Override
    public void stop(){
        System.out.println("Car stopped");
    }
    @Override
    public void lockWindow(){
        System.out.println("Window is locked");
    }
    @Override
    public void walk(){
        System.out.println("Person is walking");
    }
    @Override
    public void talk(){
        System.out.println("Jahan is talking");
    }

}

interface Car1{
    void start();
    void stop();
    void lockWindow();
}

interface Person2{
    void walk();
}
interface Jahan{
    void talk();
}


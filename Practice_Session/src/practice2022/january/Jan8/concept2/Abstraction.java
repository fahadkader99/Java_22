package practice2022.january.Jan8.concept2;

public class Abstraction {
    public static void main(String[] args) {

        Audi a1 = new Audi();
        a1.radio();

        BMW b1 = new BMW();
        b1.radio();

    }
}

class Audi extends Car{
    @Override
    void radio(){
        System.out.println("Radio from Audi");
    }
}
class BMW extends Car{
    @Override
    void radio(){
        System.out.println("Radio from BMW");
    }
}


abstract class Car{

    int price;

     void start(){
        System.out.println("Car is starting ");
    }
    abstract void radio();  // abstract method end with semicolon
}
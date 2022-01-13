package practice_session.oop.interface_demo.interfaceFirst;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Animal a = new Dog();
        Animal b = new Cat();
        b.eat();

        Cat c = new Cat();
        c.eat();
        c.sleep();

    }
}

package practice_session.oop.toStringMethod;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Kader", 28);
        Person p2 = new Person("Fahad", 20);

        System.out.println(p1);     // by default toString method is called
        System.out.println(p2);

    }
}

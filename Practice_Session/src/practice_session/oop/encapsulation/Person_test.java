package practice_session.oop.encapsulation;

public class Person_test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Fahad Kader ");
        System.out.println(p1.getName());

        p1.setAge(20);
        System.out.println(p1.getAge());

    }
}

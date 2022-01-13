package practice_session.oop.abstraction;

public class shape_tester {
    public static void main(String[] args) {

        Shape a = new Rectangle(10,20);
        a.size();
        a.length();

        Shape b = new Rectangle(5,10);
        b.size();
        b.length();

        Shape c = new Circle(15,30);
        c.size();
        c.length();

    }
}

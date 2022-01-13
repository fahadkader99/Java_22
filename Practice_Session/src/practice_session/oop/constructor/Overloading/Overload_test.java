package practice_session.oop.constructor.Overloading;

public class Overload_test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();   // default constructor

        Teacher teacher2 = new Teacher("Fahad", "Male");    // parameterized 1st constructor
        teacher2.printInfo();

        Teacher teacher3 = new Teacher("Kader", "Male", 302510989);
        teacher3.printInfo();

    }
}

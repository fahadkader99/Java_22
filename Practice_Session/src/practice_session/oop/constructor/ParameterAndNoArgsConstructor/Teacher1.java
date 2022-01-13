package practice_session.oop.constructor.ParameterAndNoArgsConstructor;

public class Teacher1 {

    public static void main(String[] args) {

       Teacher teacher1 = new Teacher("Fahad", 'M', 29);
       teacher1.printInfo();

       Teacher teacher4 = new Teacher(302, 500.99);
        teacher4.printInfo();

       Teacher teacher3 = new Teacher();
       teacher3.printInfo();
    }

}

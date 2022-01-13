package practice_session.oop.inheritance;

public class Test_Person {
    public static void main(String[] args) {
        Teacher_Person t1 = new Teacher_Person();

        t1.name= "Fahad";
        t1.age = 29;
        t1.id = 101;
        t1.qualification = "Science";
        //t1.displayInfo1();
        t1.displayInfo2();


        System.out.println("\nTeacher -2");
        Teacher2 t2 = new Teacher2();
        t2.name = "Jahan";
        t2.id = 102;
        t2.age = 27;
        t2.displayInfo1();
        t2.displayInfo3();
    }
}

package practice_session.oop.inheritance;

public class Teacher_Person extends Person{     // now Teach is extending and sharing the Person class properties.
    String qualification;
    int id;

    void displayInfo2(){
//        System.out.println("Name "+ name);
//        System.out.println("Age "+ age);
        displayInfo1();
        System.out.println("Qualification: "+ qualification);
    }

}

class Teacher2 extends Person{
    String title;
    int id;

    void displayInfo3(){
        System.out.println("Title "+ title);
        System.out.println("ID "+ id);
    }
}

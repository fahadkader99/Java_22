package small_projects.student_DB_app;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;  // When static - it is not specific for any object but it is true or same for all the object, so it belongs to the class - so it remains same for all the object in the class
    private static int ID = 1000;


    // Constructor: promt user to enter students name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student First Name: ");
        this.firstName = scanner.nextLine().trim();

        System.out.println("Enter Student Last Name: ");
        this.lastName = scanner.nextLine().trim();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();

        System.out.println(firstName+" " + lastName+" " + gradeYear + " " + studentID);








    }

    // Generate a ID
    private void setStudentID(){
        // grade level + ID
        ID++;
         this.studentID =  gradeYear + "" + ID;
    }

    // Enroll in courses
    public void enroll(){
        // Set inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quiet): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine().trim();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }
        }while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);

    }

    // View balance

    // Pay tuition

    // Show status
}

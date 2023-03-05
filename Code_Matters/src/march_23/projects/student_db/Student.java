package march_23.projects.student_db;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private String  studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    public Student(){                                                                       // Power of Constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine().trim();
        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine().trim();
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradYear = sc.nextInt();
        setStudentID();

        //System.out.println(firstName +" " + lastName +" " + gradYear + " " + studentID);



    }


    // generate an ID
    private void setStudentID(){
        // grade level + static id
        id++;
        this.studentID =  gradYear + "" + id;
    }

    // enroll courses
    public void enroll(){
        // Get inside a loop, user hits 0 to get out
        do{                                                                                                                     // Loop will run unlimited time unless user hits Q > will break the loop
            System.out.println("Enter courses to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine().trim();
            if (!course.equals("Q")){
                this.courses = courses +"\n "+ course;                                                                            // means anything user inputs gets added into course.!
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }
        }while (1 != 0);

       //System.out.println("Enrolled in: " + courses);


    }

    // view balance
    public void viewBalance(){
        System.out.println("\nYour Balance: " + tuitionBalance);
    }

    // pay tuition
    public void payTuition(){
        viewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your payment: ");
        int payment = sc.nextInt();
        this.tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: " + payment);
        viewBalance();
    }


    // show tuition
    public String  showInfo(){
        return "\nName: " + firstName +" "+ lastName +
                "\nGrade Level: " + gradYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance;
    }
}

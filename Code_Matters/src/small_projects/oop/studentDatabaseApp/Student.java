package small_projects.oop.studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses ="";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;



    // constructor : prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nEnter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        //System.out.println(firstName+" "+lastName+" "+gradeYear+" "+ studentID);




    }


    // generate an ID
    private void setStudentID(){
        // grade level + static ID
        id++;
        this.studentID= gradeYear+""+id;
        // since the return type is string and there is string in middle it will return as string
    }


    // enroll in courses
    public void enroll(){
        // get inside a loop, user hits 0


        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if(!course.equalsIgnoreCase("Q")){
                courses += "\n  "+course;
                tuitionBalance = tuitionBalance+costOfCourse;

            }else {
                break;
            }
        }while (1 != 0);

        //System.out.println("Enrolled In: "+ courses);
        //System.out.println("Tuition Balance: "+ tuitionBalance);


    }


    // view balance
    public void viewBalance(){
        System.out.println("Your Balance is $ "+ tuitionBalance);
    }




    // pay tuition
    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter your payment: ");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("\nThank your for your payment of $ "+payment );
        viewBalance();
    }



    // show status
    public String toString(){

        return "\nName: "+firstName+" "+lastName+
                "\nGrade Level: "+ gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled: "+courses+
                "\nBalance: $ "+tuitionBalance;
    }


}

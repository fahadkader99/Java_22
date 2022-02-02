package small_projects.oop.studentDatabaseApp;

import java.util.Arrays;
import java.util.Scanner;
// https://www.youtube.com/watch?v=GOGt7PACl10&list=PLtNXxhX8HfFD8rtejX7VB4oTh_xxf05Fq&index=1

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // ask how many new user we want to add and add them to the array of student.
        System.out.println("\nEnter No. of new students tp enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();

        Student[] students = new Student[numOfStudent];

        // create a number of new students and show them by iterating over the Array of students
        for (int i = 0; i<numOfStudent;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }


//
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());
//        System.out.println(students[2].toString());


    }
}

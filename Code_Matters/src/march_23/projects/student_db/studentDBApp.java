package march_23.projects.student_db;

import java.util.Arrays;
import java.util.Scanner;

public class studentDBApp {

    public static void main(String[] args) {
//        Student a = new Student();
//        a.enroll();
//        a.payTuition();
//        System.out.println(a.showInfo());


        // ask how many user we want to add
        System.out.println("Enter Number of students to Enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student [] studentArr = new Student[numOfStudents];                        // created an array of object (student)


        // create N number of new students
        for (int i = 0; i < studentArr.length; i++){                               // every iteration in the loop will create an student + enroll + pay + show info
            studentArr[i] = new Student();
            studentArr[i].enroll();
            studentArr[i].payTuition();

        }

        for (int i = 0; i < studentArr.length; i++){
            System.out.println(studentArr[i].showInfo());                          // Showing info of the objects 1 by 1 in a loop

        }
    }
}

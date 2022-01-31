package talent_LMS;

import java.util.Scanner;

public class GradeCalculator {
    /*
    This program calculates the grade of a student based on the marks entered by user in each subject.
    Program prints the grade based on this logic.

If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark = sc.nextInt();

        try {
            if(mark>=80) System.out.println("Grade A");
            if(mark>=60) System.out.println("Grade B");
            if (mark<60 && mark>=40) System.out.println("Grade C");
            else System.out.println("Grade D");
        }catch (Exception e){
            System.out.println("Exception found try again. ");
        }

    }
}

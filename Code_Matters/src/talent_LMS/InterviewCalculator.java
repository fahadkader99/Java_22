package talent_LMS;

import java.util.Scanner;

public class InterviewCalculator {
    /*
    Write a function which will ask user for:

1. years in college

2. years of programming experience

3. GPA

and return true or false.



An applicant must meet two conditions to be called for interview:

4 or more years of college, AND

2 years experience programming in Java OR a grade point average greater than 3.5.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Years in college ");
        int college = sc.nextInt();
        System.out.println("Years of programming Skills");
        int skills = sc.nextInt();
        System.out.println("Your GPA ");
        double gpa = sc.nextDouble();

        interview(college,skills,gpa);


    }
    public static void interview(int college, int skills, double gpa){

        if (college>=4 && skills>=2){
            System.out.println("You are eligible for an Interview");
        }else if (college>=4 && gpa>= 3.5){
            System.out.println("You are eligible for an Interview");
        }else if(skills>=2 && gpa>= 3.5){
            System.out.println("You are eligible for an Interview");
        }else if(college>=4 && skills>=2 && gpa>= 3.5){
            System.out.println("You are eligible for an Interview");
        }else {
            System.out.println("Try again. You are not Eligible for the Interview. ");
        }

    }

}

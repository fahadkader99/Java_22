package talent_LMS;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = sc.nextInt();
        passOrFail(mark);
        System.out.println("Your mark is "+mark);

    }
    public static void passOrFail(int mark){
        if(mark<50){
            System.out.println("You have failed ");
        }else System.out.println("You have passed ");

        System.out.println("The Exam");
    }
}

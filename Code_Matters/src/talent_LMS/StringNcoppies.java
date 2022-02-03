package talent_LMS;

import java.util.Scanner;

public class StringNcoppies {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("Enter a num");
        int num = sc.nextInt();

        String s ="";
        for (int i = 0; i <num;i++){
            s += str;
        }

        System.out.println(s);
    }
}

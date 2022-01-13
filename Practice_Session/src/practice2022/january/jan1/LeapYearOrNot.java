package practice2022.january.jan1;

import java.util.Scanner;

public class LeapYearOrNot {
    // check the year leap year or not

    /**
     * to find Leap Year there is 2 condition:
     * <p>
     * Con 1 > (Century) > (year % 100 ==0 && year % 400 ==0)
     * Con 2 > (Yearly)  >  (year % 100 !=0 && year % 4 =-0)
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a year to find out Leap Year");
        int year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap Year. ");
        } else {
            System.out.println("Sorry. Not Leap Year");
        }

    }
}

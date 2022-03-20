package march_22;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // find out the given year is leap year or not.
        /*
         * 1st if the year is divisible by 4 and not divisible by 100, it is a leap year
         * if the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it is a leap year*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        boolean isLeap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    isLeap = true;

                } else {
                    isLeap = false;
                }


            } else {
                isLeap = true;
            }

        }else {

            isLeap = false;
        }
        sc.close();


        if (isLeap){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap year");
        }


    }
}

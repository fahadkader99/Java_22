package march_april_23;

import java.util.Scanner;

public class LeapYear {
    // write a program to check leap Year

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a YEAR: ");
        int year = sc.nextInt();
        sc.close();
        boolean flag = false;

        /*
         * 1st if the year is divisible by 4 and not divisible by 100, it is a leap year
         * if the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it is a leap year
         * */

        if (year % 4 == 0){

            if (year % 100 == 0){

                if (year % 400 == 0){
                    flag = true;
                }else {
                    flag = false;
                }

            }else {
                flag = true;
            }


        }
        else {
            flag = false;
        }

        if (flag){
            System.out.println("LEAP YEAR");
        }else {
            System.out.println("Not Leap Year....!");
        }


    }
}

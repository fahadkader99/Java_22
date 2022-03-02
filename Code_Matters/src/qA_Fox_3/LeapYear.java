package qA_Fox_3;

import java.util.Scanner;

public class LeapYear {
    /*
    check if the given year is leap year or not?

    Leap year: has 366 days.
        1. year / 4 == 0
            2. year /100 ==0
                3. year / 400 ==0   > then leap year

         - if the year is divisible by 4 and not divisible by 100 then   - Leap year
         - also if the year is divisible by 4 , divisible by 100 and divisible by 400   - Also Leap year.
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        boolean leapYear = false;


        if (year % 4== 0){

            if (year % 100== 0){

                if(year % 400 == 0){
                    leapYear=true;
                }else {
                    leapYear = false;
                }

            }else {
               leapYear = true;
            }
        }else {
            leapYear = false;
        }

        if (leapYear==true){
            System.out.println("Leap Year");
        }else System.out.println("Not Lear Year...!");

    }
}

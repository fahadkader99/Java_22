package practice_session.Basics_Code;

import java.util.Scanner;

public class Leap_Year {

        public static void main(String[] args) {


            /**
             * Write a java program to find out if the given year is leap or not
             *
             *  sample output:
             * enter any calendar year : 2000
             * 2000 is a leap year
             */

            //TODO write your code here

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a year: ");
            int year = input.nextInt();

            boolean flag = false;

            Leap_Year leap = new Leap_Year();
            leap.leapOrNot(year, flag);


        }

        public boolean leapOrNot(int year, boolean flag) {
            if (year % 4 == 0) {     // if the year is divided by 4
                if (year % 100 == 0) { // checking is the year century
                    if (year % 400 == 0) {     // if the year is ddivided by 400 then it is leap year
                        flag = true;

                    } else {
                        flag = false;
                    }
                } else {
                    flag = true;
                }


            } else {
                flag = false;

            }
            if (flag) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
            return flag;
        }
    }
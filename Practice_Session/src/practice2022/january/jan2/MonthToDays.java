package practice2022.january.jan2;

import java.util.Scanner;

public class MonthToDays {
    // enter month number and print number of days in a month
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month Num: ");
        int n = input.nextInt();

        switch (n){
            case 1:
                System.out.println("Jan : Days 31");
                break;
            case 2:
                System.out.println("Feb : Days 28");
                break;
            case 3:
                System.out.println("Mar : Days 31");
                break;
            case 4:
                System.out.println("Apr : Days 30");
                break;
            case 5:
                System.out.println("May : Days 31");
                break;
            case 6:
                System.out.println("Jun : Days 30");
                break;
            case 7:
                System.out.println("July : Days 31");
                break;
            case 8:
                System.out.println("Aug : Days 31");
                break;
            case 9:
                System.out.println("Sep : Days 30");
                break;
            case 10:
                System.out.println("Oct : Days 31");
                break;
            case 11:
                System.out.println("Nov : Days 30");
                break;
            case 12:
                System.out.println("Dec : Days 31");
                break;
            default:
                System.out.println("Wrong Input...!");

        }
    }
}

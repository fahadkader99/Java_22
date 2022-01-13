package random;

import java.util.Scanner;

public class DaysWithSwitch {
    /*
    Display name of a day based on number using switch, by taking u=input from the user.
     */
    public static void main(String[] args) {
    int day = 0;
    takeInput(day);
        System.out.println("Enjoy amigo!!!!");

    }
    public static int takeInput(int day){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find out day!");
        day = input.nextInt();
        findDay(day);
        return day;

    }
    public static int findDay(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Wrong input");
        }
            return day;

    }

}

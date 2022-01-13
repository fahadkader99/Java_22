package unique_Team.Sprint_1.QA;

import java.util.Scanner;

public class ChristmasTickets {
    public static void main(String[] args) {

        //         As a user I want to enter any date between December 5th and 31st
//           (5 thru 31 including both) in order to check whether there are still some available tickets.
//
//      Available dates: 7,10,12,17,19,22,24,25,26,30
//
//      Please use Array in your code.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose dates between December 5th and 31st:");
        int date = scan.nextInt();

        int[] availableDates = {7, 10, 12, 17, 19, 22, 24, 25, 26, 30};

        for (int n : availableDates) {
            if (date == n) {
                System.out.println("Couple tickets left. Don't wait, order yours now.");
                break;
            }
            System.out.println("Sorry, no tickets available. Please check another date.");
            break;
        }
    }
}
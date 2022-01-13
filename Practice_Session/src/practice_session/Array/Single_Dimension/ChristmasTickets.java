package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class ChristmasTickets {
    public static void main(String[] args) {

        //As a user I want to enter any date between December 5th and 31st
//           (5 thru 31 including both) in order to check whether there are still some available tickets.
//
//      Available dates: 7,10,12,17,19,22,24,25,26,30
//
//      Please use Array in your code.

        int[] availableDate = {7,10,12,17,19,22,24,25,26,30};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date to check the availability: ");
        int date = input.nextInt();

        for (int i = 0; i < availableDate.length; i++){
            if (availableDate[i] == date){
                System.out.println("The ticket is available Now!");
                break;
            }
            System.out.println("Ticket not available. Try another date");
            break;
        }

    }
}

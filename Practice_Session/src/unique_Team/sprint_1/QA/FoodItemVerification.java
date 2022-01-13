package unique_Team.Sprint_1.QA;

import java.util.Scanner;

public class FoodItemVerification {
    public static void main(String[] args) {

        // As a user I want to provide my favorite food in order to check whether it's in the menu this week.
//        Food available this week: soup, salad, hamburger, cheeseburger, sushi, pizza (more items can be added).
//                Please use Array in your code.

        Scanner scan = new Scanner(System.in);
        System.out.println("Food available this week: soup, salad, hamburger, cheeseburger, sushi, pizza.");
        System.out.println("Please make your choice");
        String str = scan.nextLine();

        String[] names = new String[]{"soup", "salad", "hamburger", "cheeseburger", "sushi", "pizza"};
        String output = "Sorry, we won't have it this week. Please provide another input.";

        for (String s : names) {
            if (s.equals(str)) {
                output = "Great selection, in the menu this week!";
                break;
            }
        }

        System.out.println(output);
    }


}


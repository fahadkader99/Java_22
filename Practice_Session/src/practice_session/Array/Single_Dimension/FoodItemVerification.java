package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class FoodItemVerification {
    public static void main(String[] args) {
        // As a user I want to provide my favorite food in order to check whether it's in the menu this week.
//        Food available this week: soup, salad, hamburger, cheeseburger, sushi, pizza (more items can be added).
//                Please use Array in your code.

        String[] foodItem = {"soup", "salad", "hamburger", "cheeseburger"};
        Scanner input = new Scanner(System.in);
        System.out.println("Please make your choice: ");
        String str = input.nextLine();

        for (int i = 0; i <foodItem.length; i++){
            if (foodItem[i].equals(str)){
                System.out.println("Great selection");
                break;
            }
            System.out.println("You have to wait for next week");
            break;

        }



    }
}

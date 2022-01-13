package practice_session.Basics_Code;

import java.util.Scanner;

public class DiscountOfIteams {
    public static void main(String[] args) {
        /**
         * Write a java program to calculate discount for a product
         *
         *  sample output:
         * marked price:
         * 100
         * discount rate:
         * 25
         * amount after discount: 75.0
         */

        printMessage();
    }

    public static void printMessage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Marked Price? ");
        double markedPrice = scanner.nextDouble();

        System.out.println("Discount rate: ");
        double discount = scanner.nextDouble();

        calculateDiscount(discount, markedPrice);

    }
    public static void calculateDiscount(double discount, double markedPrice){
        if (discount >=1 && discount <= 100){
            discount= (markedPrice*100)/markedPrice;
        }else {
            System.out.println("Not valid for discount");
        }
        System.out.println("Price after discount : " + markedPrice+ (markedPrice-discount));


    }
}
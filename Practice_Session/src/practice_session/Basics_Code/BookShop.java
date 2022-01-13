package practice_session.Basics_Code;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        /**
         * Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 3 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a premium customer? ");
        boolean isPremiumCustomer = input.nextBoolean();

        System.out.println("How many books to purchase? ");
        int numberOfBooks = input.nextInt();

        BookShop books = new BookShop();
        books.countFreeBooks(isPremiumCustomer, numberOfBooks);
        System.out.println("\nThanks for shopping with us!");

    }
    public int countFreeBooks(boolean isPremiumCustomer, int numberOfBooks ) {
        if (isPremiumCustomer== true) {
            if (numberOfBooks >= 5 && numberOfBooks < 8) {
                System.out.println("You are qualified for 1 free book");
            } else if (numberOfBooks >= 8) {
                System.out.println("You are qualified for 3 free books");
            }
        } else{
            if (numberOfBooks >= 7 && numberOfBooks <12){
                System.out.println("You are qualified for 1 free book");
            }else if(numberOfBooks >=12){
                System.out.println("You are qualified for 2 free books");
            }
        }
        return numberOfBooks;
    }

}

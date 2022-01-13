package practice2022.january.jan1;

import java.util.Scanner;

public class NegativeOrPositiveNum {

    // find the given num is negative or positive

    public static void main(String[] args) {

        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a No. ");
                int n = input.nextInt();
                if (n > 0) {
                    System.out.println("Positive");
                    count = 2;
                } else {
                    System.out.println("Negative");
                    count = 2;
                }
            } catch (Exception e) {
                System.out.println("Try again....! ");
            }
        } while (count == 1);

    }
}

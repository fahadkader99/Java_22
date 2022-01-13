package practice2022.january.jan1;

import java.util.Scanner;

public class FIndMaxMin {
    // input 2 number and find max or min.

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 2 num : ");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int choice = 0;

            do {
                System.out.println("\n1. Find Max ");
                System.out.println("2. Find Min ");
                System.out.println("3. Stop");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        if (n1 > n2) {
                            System.out.println("Max is: " + n1);
                        } else System.out.println("Max is: " + n2);
                        break;
                    case 2:
                        if (n1 > n2) {
                            System.out.println("Min is: " + n2);
                        } else System.out.println("Min is: " + n1);
                        break;
                    case 3:
                        System.out.println("The End !");
                        break;
                }

            } while (choice != 3);
        } catch (Exception e) {
            System.out.println("Exception found: " + e);
            System.out.println("Try Again....!");
        }

    }
}

package practice2022.january.jan1;

import java.util.Scanner;

public class OddEven {
    // check the num is odd or even

    public static void main(String[] args) {


        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter num to find odd or even");
                int num = input.nextInt();

                if (num % 2 == 0) {
                    System.out.println("Num is even");
                    count = 2;
                } else{
                    System.out.println("Num is uneven");
                    count = 2;
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("Try again....!");
            }
        } while (count == 1);


    }
}

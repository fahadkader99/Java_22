package practice2022.january.jan1;

import java.util.Scanner;

public class PrintOddInRange {
    // print odd num in given range.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a num for N: ");
        int n = input.nextInt();
        int odd = 0;

        System.out.println("\nOdd num are: ");
        for (int i = 0; i <= n; i++){
            if ( i % 2 != 0 ){
                System.out.println(i);
            }
        }

    }
}

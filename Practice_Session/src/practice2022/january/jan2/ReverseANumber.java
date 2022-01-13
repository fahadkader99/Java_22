package practice2022.january.jan2;

import java.util.Scanner;

public class ReverseANumber {
    /// Reverse a given number:
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int num = input.nextInt();
        int remainder =0;

         while (num > 0){

             remainder = num % 10;
             System.out.print(remainder);
             num = num / 10;
         }

    }
}

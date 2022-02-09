package talent_LMS;

import java.util.Scanner;

public class LoopSum {
    // Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total.
    // Use a for || while loop to do it.

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Num:");
            int num = sc.nextInt();
            sc.close();

            int sum = 0;
            for (int i = 1; i <=num;i++){
                sum = sum+i;
            }
            System.out.println("Sum is: "+sum);
        }catch (Exception e){
            System.out.println("Try again...!");
        }

    }


}

package talent_LMS;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        /*
        Write a program that uses a for loop to display all the numbers from 1 to 20,
        marking those which are even (divisible by two). It should use modulus by 2: if the remainder is zero, it's divisible by 2.

This means you'll need an if statement inside the loop.


         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int num = sc.nextInt();

        for (int i = 0; i <=num;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}

package talent_LMS;

import java.util.Scanner;

public class PrimeNum {
    // check is the number is prime or not
    // prime number is divisible by 1  and the num itself.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int count  = 0;
        for (int i = 1; i<=num;i++){
            if (num % i ==0){
                count++;
            }
        }


        if (count == 2) System.out.println("Prime");
        else System.out.println("Not Prime");


    }
}

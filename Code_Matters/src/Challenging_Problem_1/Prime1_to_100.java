package Challenging_Problem_1;

import java.util.Scanner;

public class Prime1_to_100 {

    public static void main(String[] args) {
        // find all the prime number from 1 to 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i<=num;i++){
           boolean isPrime = true;

           for (int j = 2; j<i; j++){
               if (i % j ==0){
                   isPrime = false;
               }
           }

           if (isPrime){
               System.out.print(i+" ");
           }

        }


    }
}

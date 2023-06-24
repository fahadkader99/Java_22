package march_april_23;

import java.util.Scanner;

public class PrimeNum {
    //A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    //Write a method that checks if a number is a prime number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        PrimeNum prime = new PrimeNum();
        prime.one(num);
        prime.two(num);

    }

    void one(int num){
        int count = 0;

        for (int i = 1; i<=num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    void two (int num){                             // 1 is not a prime number but this method returns true
        boolean isPrime = true;

        for (int i = num - 1; i > 1; i--){
            if (num % i ==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}

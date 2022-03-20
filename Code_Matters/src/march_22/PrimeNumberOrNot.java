package march_22;

import java.util.Scanner;

public class PrimeNumberOrNot {
    // find out the number is prime or not: number deviced by 1 and the number itself
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=num;i++){
            if (num % i == 0){
                count++;
            }
        }

        if (count==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }

       if (isPrime(num) == true){
           System.out.println("Prime");
       }else {
           System.out.println("Not Prime");
       }

        //System.out.println(isPrime(num));


    }
    public static boolean isPrime(int num){                 // by the books
        if (num <=1){
            return false;
        }

        for (int i = 2; i < Math.sqrt(num);i++){
            if (num % i==0){
                return false;
            }
        }
        return true;

    }
}

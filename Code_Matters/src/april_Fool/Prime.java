package april_Fool;

import java.io.PrintStream;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

       // isPrime(num);
        all_prime_1_50(num);


    }
    public static void isPrime(int num){
        int count = 0;

        for (int i=1; i<=num;i++){
            if (i % 2==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }

    public static void all_prime_1_50(int num){

        for (int i = 1; i<num; i++){

            boolean isPrime = true;

            if (i>1){

                for (int j = 2; j<i; j++){
                    if (i%j==0){
                        isPrime = false;
                    }
                }


            }
            else {
                isPrime = false;
            }

            if (isPrime){
                System.out.print(i+" ");
            }


        }



    }
}

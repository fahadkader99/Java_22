package november_22;

import java.util.Scanner;

public class FindCommonDivisor {
    public static void main(String[] args) {
        // find the greatest common divisor between 2 number

        /*
        find the max number
        run the loop up to max number
        check if the divisor is divisible by both the number

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int max = Math.max(a,b);
        int greatest = 0;               // instance variable - keep changing and only stores the latest change

        for (int i = 1; i<=max; i++){
            if (a % i==0 && b % i ==0){
                System.out.println(i+" ");
                greatest = i;
            }
        }

        System.out.println("\nGreatest divisor is: " + greatest);





    }
}

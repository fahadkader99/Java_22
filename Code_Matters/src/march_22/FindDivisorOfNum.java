package march_22;

import java.util.Scanner;

public class FindDivisorOfNum {
    // find the divisor of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        for (int i = 1; i<= num;i++){
            if (num % i ==0 ){
                System.out.print(i+" ");
            }
        }


    }
}

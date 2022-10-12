package June;

import java.util.Scanner;

public class SumOfDigits {

    // find the sum of digits in  a number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number to find the sum of its own");
        int num = sc.nextInt();

        int sum = 0;

        while(num!=0){
            int remainder = num %10;
            sum +=  remainder;
            num = num/10;
        }
        System.out.println("Sum "+ sum);

    }
}

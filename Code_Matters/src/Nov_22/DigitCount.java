package Nov_22;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a Num ");
        int a = sc.nextInt();
        sc.close();


        int b = a;
        int sum = 0;
        int cunt = 0;

        while (b > 0){
            int rem = b % 10;
            sum+= rem;
            b = b/10;
            cunt++;
        }

        System.out.println("Total Digit: " + cunt);
        System.out.println("Sum of digit: " + sum);



    }
}

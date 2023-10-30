package november_22;

import java.util.Scanner;

public class Largest3 {
    // find the largest number from 3 number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Num: " );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = (a > b)? a:b;
        int largest = (large > c)? large : c ;

        System.out.println("\nLargest of 3 num: " + largest);





    }
}

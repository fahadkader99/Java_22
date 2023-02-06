package jan_23;

import java.util.Scanner;

public class OddEvenDigits {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int a = sc.nextInt();
        sc.close();

        int even = 0;
        int odd = 0;
        int count = 0;

        while (a > 0){
            int rem = a % 10;
            if (rem % 2 == 0){
                even++;
            }
            if (rem % 2 != 0){
                odd++;
            }
            a = a/10;
            count++;
        }
        System.out.println("\nEven " + even);
        System.out.println("Odd " + odd);
        System.out.println("Total digit: " + count);
    }
}

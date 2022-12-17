package Nov_22;

import java.util.Scanner;

public class OddEvenDigits {
    // count the number of odd & even digits from  a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        sc.close();
        int count = 0;
        int even = 0;
        int odd = 0;

        while (a!=0){
            int rem = a % 10;

            if (rem % 2 ==0){
                even++;
            }
            if (rem % 2 != 0){
                odd++;
            }

            a = a/10;
            count++;
        }

        System.out.println("Total Digit " + count);
        System.out.println("Even " + even);
        System.out.println("Odd " + odd);


    }
}

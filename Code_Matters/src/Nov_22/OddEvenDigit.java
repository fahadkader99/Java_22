package Nov_22;

import java.util.Scanner;

public class OddEvenDigit {
    // count the number of odd even digits in a given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        sc.close();

        int even = 0;
        int odd = 0;

        while (a > 0){

            int rem = a % 10;

            if (rem % 2 ==0){
                even++;
            }else {
                odd++;
            }

            a = a/10;
        }

        System.out.println("\nEven " + even +"\nOdd " + odd);

    }
}

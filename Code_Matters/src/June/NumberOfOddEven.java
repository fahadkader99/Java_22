package June;

import java.util.Scanner;

public class NumberOfOddEven {
    // find the number of odd and even number in  a number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number to test Odd and Even number to count them separately ");
        int num = sc.nextInt();
        sc.close();

        int even = 0;
        int odd = 0;


        while (num !=0){
            int remainder = num %10;

            if (remainder % 2 == 0){
                even++;
            }
            else {
                odd++;
            }

            num = num/10;
        }

        System.out.println("Even Num "+ even);
        System.out.println("Odd Num "+ odd);

    }
}

package march_22;

import java.util.Scanner;

public class CountEvenOddDigitsInNum {
    // count the number of even and odd digits in a number:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int eCount = 0;
        int oCount = 0;

        while (num > 0){
            int remainder = num % 10;

            if (remainder % 2 == 0){
                eCount++;
            }
            else {
                oCount++;
            }
            num = num / 10;
        }

        System.out.println("Even num: "+ eCount);
        System.out.println("Odd num: "+ oCount);



    }
}

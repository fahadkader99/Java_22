package march_april_23;

import java.util.Scanner;

public class Add2BinaryNums {
    // write a program to add 2 binary nums
    public static void main(String[] args) {

        long b1, b2;
        int i = 0, carry = 0;
        // to hold hte output binary numbers
        int[] sum = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary number: ");
        b1 = sc.nextLong();
        System.out.println("Enter 2nd binary number: ");
        b2 = sc.nextLong();
        sc.close();                                                 // close scanner to avoid memory leak

        while (b1 != 0 || b2 != 0){
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) %2);
            carry = (int) ((b1 % 10 + b2 %10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }

        if (carry != 0){
            sum[i++] = carry;
        }
        --i;
        System.out.println("Output: ");
        while (i >= 0){
            System.out.println(sum[i--]);
        }
        System.out.println("/n");




    }
}

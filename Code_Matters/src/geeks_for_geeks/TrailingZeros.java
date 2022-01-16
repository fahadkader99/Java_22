package geeks_for_geeks;

import java.util.Scanner;

public class TrailingZeros {
    // Find num of Trailing Zeros in Factorial
    // so how many 0's at the end. (count the num 0 at the end)
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter num to find trailing Zero's:");
        int n = obj.nextInt();

        int result = 0;
        while (n>0){
            n = n /5;
            result+=n;
        }
        System.out.println("No. of trailing zero = "+ result);


    }
}

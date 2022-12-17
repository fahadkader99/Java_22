package Nov_22;

import java.util.Scanner;

public class ReverseNumber {
    // reverse the given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        int b = a;
        int rev = 0;

        while (b>0){
            int rem = b % 10;
            rev  = rev * 10 + rem;
            b= b/10;

        }
        System.out.println(rev);
    }
}

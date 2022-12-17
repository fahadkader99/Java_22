package Nov_22;

import java.util.Scanner;

public class ReverseNum {
    // reverse a number in java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        int b = a;
        sc.close();

        int rev = 0;

        while (b != 0){
            int mod = b%10;
            rev = (rev*10) + mod;
            b = b/10;
        }
        System.out.println(rev);
    }
}

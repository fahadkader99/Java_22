package march_22;

import java.util.Scanner;

public class ReverseNum {
    // reverse an given Number:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();

        int rev = 0;
        while (n > 0){
            int remainder = n %10;
            rev = (rev *10) + remainder;
            n = n/10;
        }
        System.out.println(rev);


    }
}

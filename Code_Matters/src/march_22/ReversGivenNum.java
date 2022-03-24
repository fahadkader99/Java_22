package march_22;

import java.util.Scanner;

public class ReversGivenNum {
    // reverse a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int r = 0;
        while (num > 0){
            int remainder = num % 10;
            r = (r * 10) + remainder;
            num = num / 10;
        }
        System.out.println("reverse: "+ r);


    }
}

package practice_session.Basics_Code;

import java.util.Scanner;

public class Find_Digit_In_Number {
    // input a number and count digit, take it for user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to find digits");
        int n = input.nextInt();

        Find_Digit_In_Number q = new Find_Digit_In_Number();
        q.findDigit(n);
    }
    void findDigit(int n){
        int count = 0;
        while (n > 0){
            n = n/10;       // as many times we divide n with 10, the count value increases.
            count++;
        }
        System.out.println("The number of digits are: " + count);

    }
}

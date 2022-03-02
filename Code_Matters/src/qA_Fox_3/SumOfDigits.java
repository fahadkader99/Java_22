package qA_Fox_3;

public class SumOfDigits {
    public static void main(String[] args) {
        // java program to find the sum of all the digits in the inputed number.

        int digit = 1234;    // sum = 10;

        int sum = 0;

        while (digit>0){
            int last = digit %10;
            sum = sum+last;
            digit = digit/10;
        }

        System.out.println(sum);


    }
}

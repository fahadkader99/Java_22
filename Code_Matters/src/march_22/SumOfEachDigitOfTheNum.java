package march_22;

import java.util.Scanner;

public class SumOfEachDigitOfTheNum {

    // find sum of each digit of a given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num>0){
            int r = num%10;
            sum = sum+r;
            num = num/10;
        }
        System.out.println(sum);

    }
}

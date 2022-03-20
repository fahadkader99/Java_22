package march_22;

import java.util.Scanner;

public class SumOfDigitsInANum {
    // find sum of all the digits in a num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0){
            sum += num %10;
            num = num/10;
        }
        System.out.println(sum);


    }
}

package rough_and_tough_2;

import java.util.Scanner;

public class SumOfDigits {
    // find sum of digits in a given number:

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num>0){
            sum = sum+num%10;
            num = num/10;
        }

        System.out.println(sum);
    }
}


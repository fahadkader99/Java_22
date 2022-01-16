package pair_programming;

import java.util.Scanner;

public class ArmstrongNumber {
    //Armstrong Num.
    /*
    check given num is Armstrong num or not
    Armstrong num: is a num that is equal to the sum of cubes of its digits

    in: 153, 1^3 + 5^3 + 3^3 = 153 > output Armstrong
    in: 123, 1^3 + 2^3 + 3^3 = 36  > out: Not Armstrong.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int  num2 = num;

        int sum = 0;

        while (num>0){
            sum = sum+ (num%10)*(num%10)*(num%10);
            num = num/10;
        }
        if (num2==sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong.!");
        }

    }

}

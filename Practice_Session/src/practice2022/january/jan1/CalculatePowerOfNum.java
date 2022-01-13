package practice2022.january.jan1;

import java.util.Scanner;

public class CalculatePowerOfNum {
    // calculate power on number
    /*
    ex: n = 5
    p = 2
    result = 5 *5 = 25
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. : ");
        int num = input.nextInt();
        System.out.println("Enter Power: ");
        int power = input.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = num * result;
        }
        System.out.println("Result " + result);


    }
}

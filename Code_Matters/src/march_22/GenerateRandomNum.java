package march_22;

import java.util.Scanner;

public class GenerateRandomNum {
    // generate a random number of a given range
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        double random = Math.random();

        System.out.println("Random num of the range: "+(random*num));       // random with double number
        System.out.println("Random num of the range: "+(int)(random*num));
    }
}

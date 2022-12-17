package Nov_22;

import java.util.Scanner;

public class RandomNumber {
    // program to generate random num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range ");
        int range = sc.nextInt();

        double random = Math.random();

        System.out.println("Random num of range " + range +" is = " + (int)(random*range));
    }
}

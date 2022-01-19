package chirag_YT;

import java.util.Scanner;

public class DivisibleBy5OrNot {
    // find if the given number is divisible by 5 or not?
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = inout.nextInt();

        if (num% 5==0){
            System.out.println("Divisible");
        }else System.out.println("Not divisible");

    }
}

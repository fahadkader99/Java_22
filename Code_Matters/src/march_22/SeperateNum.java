package march_22;

import java.util.Scanner;

public class SeperateNum {
    // seperate all the given digits

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a num");
        int num = sc.nextInt();

        printSeparate(num);


    }
    public static void sumOfDigits(int num){

        int r = 0;
        while (num != 0){
            int remainder = num % 10;
            r += remainder;
            num = num/10;

        }
        System.out.println(r);
    }
    public static void printSeparate(int num){
        int r = 0;
        while (num != 0){
            System.out.println(num % 10);
            num = num/10;
        }
    }
}

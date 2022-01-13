package practice2022.january.jan1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Print multiplication table as per input.

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter No. to see Multiplication Table : ");
        int num = input.nextInt();

        System.out.println("Multiplication table of # "+ num);
        for (int i = 1; i <= num; i++){
            System.out.println(num+" x "+ i + " = "+ (num*i));
        }


    }
}

package practice2022.chirag_Youtube;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = inout.nextInt();
        inout.close();

        if (num %2 ==0 ){
            System.out.println("Even");
        }else System.out.println("Odd");


    }
}

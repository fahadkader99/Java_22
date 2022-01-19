package chirag_YT;

import java.util.Scanner;

public class PosNegOrZero {

    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = inout.nextInt();


        if(num >0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else if (num ==0){
            System.out.println("Zero");
        }

    }
}

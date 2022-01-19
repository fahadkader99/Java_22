package chirag_YT;

import java.util.Scanner;

public class PrintSquarePattern {
    /*
    Print the following pattern
    *****
    *****
    *****
    *****
    *****

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();


        for (int i = 0;i <=num;i++){
            for (int j = 0; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

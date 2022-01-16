package pair_programming;

import java.util.Scanner;

public class PrintPattern {
    /*
    Printing patterns
    example:
    *****
    *****
    *****
    *****
    *****
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of times for the Patters: ");
        int num = s.nextInt();

        for (int i = 0; i <=num;i++){
            for (int j = 0;j <=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

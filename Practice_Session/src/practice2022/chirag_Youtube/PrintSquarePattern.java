package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PrintSquarePattern {
    /*
    print the following patter
    11111
    22222
    33333
    44444
    55555
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to see the pattern");
        int num = in.nextInt();

        for (int i = 1; i<=num;i++){
            for (int j = 1; j <=num; j++){
                System.out.print("#");
            }
            System.out.println();
        }


    }
}

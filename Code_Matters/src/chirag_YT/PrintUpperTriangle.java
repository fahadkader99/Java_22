package chirag_YT;

import java.util.Scanner;

public class PrintUpperTriangle {
    /*
            *
           ***
           ****
          ******
          *******
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){

            for (int s = 1; s<=num-i;s++){
                System.out.print("_");

            }
            for (int j = 1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}

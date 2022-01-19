package chirag_YT;

import java.util.Scanner;

public class PrintDiamondTriangle {
    // one of the most complex pattern is diamond triangle. Use both upper and below triangle so 6 for loops

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();


        for (int i = 1; i<=num-1;i++){

            for (int s = 1; s<=num-i;s++){
                System.out.print(" ");

            }
            for (int j = 1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = num; i>=1; i--){

            for (int s = 1; s<=num-i;s++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}

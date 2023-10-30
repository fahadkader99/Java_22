package november_22;

import java.util.Scanner;

public class PrintStart {
    // print a simple star pattern
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int a = sc.nextInt();
        sc.close();

        for (int i=1; i<=a; i++){

            for (int j = 1; j<=i; j++){

                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

package practice2022.january.jan1;

import java.util.Scanner;

public class PrintTillNnum {
    // print up to N natural num;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num for N: ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }
}

package march_22;

import java.util.Scanner;

public class PrintReverseorder {
    public static void main(String[] args) {
        //// print the reverse order of N
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();


        for (int i = n; i>=0; i--){
            System.out.println(i);
        }


    }
}

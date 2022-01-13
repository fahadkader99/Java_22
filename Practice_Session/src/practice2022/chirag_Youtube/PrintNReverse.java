package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PrintNReverse {
    // print the reverse order of N
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int n = s.nextInt();

        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }


    }
}

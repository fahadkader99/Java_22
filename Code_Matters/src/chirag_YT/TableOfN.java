package chirag_YT;

import java.util.Scanner;

public class TableOfN {

    public static void main(String[] args) {
        // print out table of N

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No.");
        int n = s.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.println(n+" x "+ i+" = "+ (n*i));
        }


    }


}

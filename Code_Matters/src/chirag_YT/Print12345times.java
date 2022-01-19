package chirag_YT;

import java.util.Scanner;

public class Print12345times {
    /*
    print following pattern
    12345
    12345
    12345
    12345
    12345
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){
            for (int j = 1;j<=num;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}

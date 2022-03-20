package march_22;

import java.util.Scanner;

public class FindMaxFrom2 {
    // find max number out of 2 number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 num");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }
}

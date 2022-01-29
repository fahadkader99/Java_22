package rough_and_tough;

import java.util.Scanner;

public class FibonacciSeries {
    // print fibonacci series until given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Num: ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        int add;

        for (int i = 1; i<=num;i++){
            System.out.println(first);
            add = first+second;
            first=second;
            second=add;
        }

    }
}

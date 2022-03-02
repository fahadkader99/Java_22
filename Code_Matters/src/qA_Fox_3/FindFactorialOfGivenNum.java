package qA_Fox_3;

import java.util.Scanner;

public class FindFactorialOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num;");
        int num = sc.nextInt();
        sc.close();
        int factor = 1;
        for (int  i = 1;i<=num;i++){
            factor = factor*i;
        }
        System.out.println(factor);

    }
}

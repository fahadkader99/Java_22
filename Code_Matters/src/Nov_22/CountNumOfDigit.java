package Nov_22;

import java.util.Scanner;

public class CountNumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();
        sc.close();
        int b = a;
        int count = 0;

        while (b!=0){

            b = b/10;
            count++;
        }
        System.out.println("Num of digit " + count);



    }
}

package practice2022.chirag_Youtube;

import java.util.Scanner;

public class DivisorOrFactorOfN {
    /*
    a program to find divisor or factor of given number

    Divisor - a num that divides a int num perfectly

    ex; n = 6; output = 1, 2,3,6
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int n = s.nextInt();

        for (int i = 1; i <=n; i++){
            if (n % i ==0){
                System.out.print(i+" ");
            }else {
                System.out.println("Not Divisible");
            }

        }



    }
}

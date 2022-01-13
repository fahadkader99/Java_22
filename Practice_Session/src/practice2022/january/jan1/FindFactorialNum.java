package practice2022.january.jan1;

import java.util.Scanner;

public class FindFactorialNum {
    // find factorial of a inputted num.
    /*
    ex: num = 5 > factorial is 120.
    so, all the number smaller than 5 and multiple them.
    5*4*3*2*1 = 120.
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. to find factorial: ");
        int n = input.nextInt();

        int fact = 1;

        for (int i = 1; i <=n; i++){
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);


    }
}

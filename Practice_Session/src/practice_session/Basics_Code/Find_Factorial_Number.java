package practice_session.Basics_Code;

import java.util.Scanner;

public class Find_Factorial_Number {
    // input a number and find factorial. ex: 5 factorial is 120.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int a = in.nextInt();

        Find_Factorial_Number q = new Find_Factorial_Number();
        q.findFactorial(a);

    }
    int findFactorial(int a){
        int r = 1;
        for (int i = 1; i <=a; i++){
           r = r*i;
        }
        System.out.println("The factorial of " + a + " is "+ r);
        return r;
    }

}

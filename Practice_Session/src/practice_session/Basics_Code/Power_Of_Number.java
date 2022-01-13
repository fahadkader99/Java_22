package practice_session.Basics_Code;

import java.util.Scanner;

public class Power_Of_Number {
    // calculate power of number from user:

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Enter power: ");
        int p = input.nextInt();
        Power_Of_Number o = new Power_Of_Number();
        o.findPower(n,p);

    }
    public void findPower(int n , int p){
        int result=1;
        for (int i = 1; i <= p; i ++){
            result = result * n;            // why multiply with result, not with n?

        }
        System.out.println("The power of "+ n + " is "+ result);

    }
}

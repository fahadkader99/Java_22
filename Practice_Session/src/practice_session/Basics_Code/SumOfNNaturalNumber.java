package practice_session.Basics_Code;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    static int n;       // static variable is available by all methods
    int sum = 0;
    int  i = 0;
    public static void main(String[] args) {
        // find the sum of n natural number.


        System.out.println("Enter a number for N: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        SumOfNNaturalNumber num = new SumOfNNaturalNumber();
        num.getN();


    }
    void getN(){
        for (i =1; i <=n; i++){
            sum =  sum + i;
            //System.out.println("Sum of "+ i + " is " +sum );
        }
        System.out.println("Sum of "+ i + " is " +sum );
    }
}

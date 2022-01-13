package practice_session.Basics_Code;

import java.util.Scanner;

public class PrintEvenNumberInRange {
    // Print out even numbers only from a given range.

    static int n =0;
    static int result = 0;
    int i = 0;

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a range to see the EVEN number: ");
        n=r.nextInt();

        PrintOddNumberGivenRange p = new PrintOddNumberGivenRange();
        p.getN();   // Q, even though i am calling why it is not coming up?

        PrintEvenNumberInRange q = new PrintEvenNumberInRange();
        q.getEven();

    }
     public void getEven(){

        for (i = 1; i <= n; i ++){
            if (i % 2 ==0){
                System.out.println("The even numbers are: " + i);
            }
        }
    }
}

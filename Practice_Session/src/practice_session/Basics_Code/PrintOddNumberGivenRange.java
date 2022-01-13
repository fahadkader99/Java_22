package practice_session.Basics_Code;

import java.util.Scanner;

public class PrintOddNumberGivenRange {

    // print out odd number in given range:
        //note: Odd = (n % 2 ==1) , Even = (n % 2 ==0)

    static int n=0;
    static int result = 0;
    static int i = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a range to print out ODD numbers: ");
        n = input.nextInt();

        PrintOddNumberGivenRange p = new PrintOddNumberGivenRange();
        p.getN();

    }
    void getN(){
        for (i = 1; i <=n; i ++){
           if (i % 2==1){
               System.out.println("The odd numbers are: " + i);
           }

        }

    }

}

package random;

import java.util.Scanner;

public class OddOrEven_usingMethod {
    // fina a number is odd or even
    public static void main(String[] args) {

        int n = 0;
        getInput(n);
       // calculateMath(n);


    }
    public static int getInput(int n){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to find out odd or even! ");
        n = input.nextInt();
        calculateMath(n);
        return n;
    }
    public static int calculateMath(int n){
        if (n %2 == 0) {
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd");

        }
    return 0;
    }
}

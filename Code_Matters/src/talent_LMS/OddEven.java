package talent_LMS;

import java.util.Scanner;

public class OddEven {
    /*
    Write a boolean method called isOdd() in a class called OddEvenTest, which takes an int as input and returns true if the it is odd.
    The signature of the method is as follows:

public static boolean isOdd(int number);
Also write the main() method that prompts user for a number, and prints "ODD" or "EVEN". You should test for negative input. For examples,

Enter a number: 9
9 is an odd number

Enter a number: 8
8 is an even number

Enter a number: -5
-5 is an odd number
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        boolean flag = false;
        if (isOdd(num)==true){
            System.out.println(num+" is Odd number");
        }else System.out.println(num+" is Even number");


    }
    public static boolean isOdd(int num){
        boolean flag = false;
        if (num % 2 !=0){
            flag = true;
        }else flag = false;

        return flag;

    }
}

package talent_LMS;

import java.util.Scanner;

public class SwapInt {
    /*
    Write a program called Swap2Integers that prompts user for two integers.
    The program shall read the inputs as int, save in two variables called number1 and number2;
    swap the contents of the two variables; and print the results. For examples,

Enter first integer: 9
Enter second integer: -9
After the swap, first integer is: -9, second integer is: 9
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int n1 = sc.nextInt();
        System.out.println("Enter Num2");
        int n2 = sc.nextInt();

        int temp  = n1;
        n1 = n2;
        n2 = temp;

        System.out.println(n1+"\n" +
                n2);


    }


}

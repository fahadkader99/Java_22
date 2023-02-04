package jan_23;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumWithStack {
    // reverse a number using stack.
    // Get the digits using % & push each digit in the stack

    // Note: Stack is a LIFO data structure so output number will be a number in a reverse order

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a  = sc.nextInt();
        int b = a;
        sc.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        while (b > 0){
            int rem = b % 10;
            stack.push(rem);
            b = b/10;
        }
        System.out.println(stack);



    }
}

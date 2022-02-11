package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses_BracketProblem {
    /*
    * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    * determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
* Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets in string");
        String s = sc.nextLine();
        sc.close();

        System.out.println(isValid(s));


    }
    public static boolean isValid(String s){
        if (s.length() % 2 !=0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){

            if (c=='(' || c =='{' || c =='['){
                stack.push(c);
            }
            else if (c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if (c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if (c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}

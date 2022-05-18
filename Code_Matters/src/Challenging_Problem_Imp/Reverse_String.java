package Challenging_Problem_Imp;

import java.util.Arrays;

public class Reverse_String {
    /* LeetCode - 344
    * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

    // LeetCode- 344
    public static void main(String[] args) {

        String [] str = {"h","e","l","l","o"};

        //String[] ass = doReverse(str);
        String[] ass = reverseWithPointer(str);

        System.out.println(Arrays.toString(ass));


    }
    public static String[] doReverse(String[] str){             // both works for reversing

        for (int i = 0; i< str.length / 2; i++){
            String temp = str[i];
            str[i] = str[str.length -1 -i];
            str[str.length -1 -i] = temp;
        }

        return str;


    }

    public static String[] reverseWithPointer(String[] str){

        int a_pointer = 0;
        int b_pointer = str.length-1;

        while (a_pointer <= b_pointer){

           String temp = str[a_pointer];
           str[a_pointer] = str[b_pointer];
           str[b_pointer] = temp;

           a_pointer +=1;
           b_pointer -=1;

        }

        return str;


    }
}

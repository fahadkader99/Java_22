package Challenging_Problem_Imp;

import java.util.Scanner;

public class Implement_Str {
    /*Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    * Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0*/
//leetcode - 28

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("enter a needle ");
        String needle = sc.nextLine();

        System.out.println(findOccurrence(str,needle));

    }
    public static int findOccurrence(String str, String needle){

        if(str == null || needle == null || needle.length() > str.length()){
            return -1;
        }
        if (needle.length()==0) return 0;

        for (int i = 0; i<str.length() - needle.length() + 1; i++){

            if (str.charAt(i)==needle.charAt(0)){

                if (str.substring(i, needle.length()+1).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}

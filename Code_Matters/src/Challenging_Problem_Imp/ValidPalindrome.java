package Challenging_Problem_Imp;

import java.util.Scanner;

// 125

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println(palindromeString(str));
    }
    public static boolean palindromeString(String str){

        int i = 0;
        int j = str.length()-1;

        while (i < j){

            while (i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }

            if (i < j && Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))){
                return false;
            }
        }
        return true;

    }

}

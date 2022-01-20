package codingBat.string1;

import java.util.Scanner;

public class concat {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
     *
     *
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter str 1: ");
        String str1 = input.nextLine();
        System.out.println("Enter str 2: ");
        String str2 = input.nextLine();

          String str = "";

          if(str1.charAt(str1.length()-1)==str2.charAt(0)){
              str=str1.substring(0,str1.length()-1)+str2;
          }else {
              str=str1+str2;
          }

        System.out.println("Result: "+ str);



    }
}

package c_Bat.string2;

import java.util.Scanner;

public class mixString {
    /*
    * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
    * the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Enter b string:");
        String b = sc.nextLine();
        sc.close();

        int aLength = a.length();
        int bLength = b.length();

        int max = Math.max(aLength,bLength);
        String word = "";

        for (int i = 0; i < max;i++){
            if (i <= aLength-1){
                word += a.substring(i,i+1);
            }
            if (i <= bLength-1){
                word += b.substring(i,i+1);
            }
        }
        System.out.println(word);


    }
}

package c_Bat.string2;

import java.util.Scanner;

public class prefixAgain {
    /*
    * Given a string, consider the prefix string made of the first N chars of the string.
    * Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Enter number for N times: ");
        int n = sc.nextInt();


        System.out.println(prefix(str, n));

    }

    public static boolean prefix(String str, int n) {

        String pre = str.substring(0, n);

        if (str.substring(n, str.length()).contains(pre)) {
            return true;
        }
        return false;
    }
}
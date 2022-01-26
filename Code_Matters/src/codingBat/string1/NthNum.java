package codingBat.string1;

import java.util.Scanner;

public class NthNum {
    /*
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Enter Num to get: ");
        int num = sc.nextInt();

        String result = "";

        for (int i = 0;i<str.length();i=i+num){
            result = result+str.charAt(i);
        }
        System.out.println(result);

    }
}

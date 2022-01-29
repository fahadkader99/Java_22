package c_Bat.string2;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleCHar {
    /*
    Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a str: ");
        String str = sc.nextLine();

        char[]ch = new char[str.length()*2];
        int count = 0;

        for (int i =0; i<str.length();i++){
            ch[count]= str.charAt(i);
            count++;
            ch[count] = str.charAt(i);
            count++;
        }
        System.out.println(Arrays.toString(ch));



    }
}

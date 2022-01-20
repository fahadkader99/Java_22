package codingBat.String2;

import java.lang.reflect.Array;
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


        char[]arr = new char[2*str.length()];
        int count = 0;

        for (int i = 0; i <str.length();i++){
            arr[count] = str.charAt(i);
            count++;
            arr[count] = str.charAt(i);
            count++;
        }
        System.out.println(Arrays.toString(arr));



    }
}

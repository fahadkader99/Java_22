package codingBat.WarmUp2;

import java.util.Scanner;

public class singleBits {
    /**
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     *
     *
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String returns = "";

        for (int i = 0; i <str.length(); i+=2){     // here i is incrementing 2 each time.
            returns += str.substring(i, i+1);
        }
        System.out.println(returns);
    }
}

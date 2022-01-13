package practice_session.Basics_Code;

import java.util.Scanner;

public class Reverse_String {
    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     *
     *
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a string to reverse: ");
        String str = input.nextLine();

        if(str.length() <= 1){
            System.out.println(str);
        }else if(str.length() > 1){

            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            String middle = str.substring(1, str.length()-1);
            System.out.println(last + middle + first);
        }



    }
}

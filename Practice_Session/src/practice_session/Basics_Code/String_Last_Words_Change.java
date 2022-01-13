package practice_session.Basics_Code;

import java.util.Scanner;

public class String_Last_Words_Change {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        if (str.length() <= 3){
            System.out.println(str.toUpperCase());
        }else if (str.length() > 3){

            String a = str.substring(0,str.length()-3);
            System.out.println(a + str.substring(str.length()-3).toUpperCase());


        }
    }

}

package pair_programming;

import java.util.Scanner;

public class ReverseString {
    //Reversing strings

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Str");
        String str =s.nextLine();

        String reverse = "";
        for (int i = 0; i <str.length(); i++){
            reverse = str.charAt(i)+reverse;
        }
        System.out.println(reverse);


    }


}

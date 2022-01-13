package random;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = input.nextLine();

        System.out.println(reverseString(str));

    }
    public static String reverseString(String str){
        String s = "";
        char c;

        for (int i = 0; i<str.length();i++){
            c = str.charAt(i);
            s = c+s;
        }
        return s;
    }
}

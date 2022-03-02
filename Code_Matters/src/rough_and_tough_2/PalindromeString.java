package rough_and_tough_2;

import java.util.Scanner;

public class PalindromeString {
    // a string that reads same from both side, same after reverse.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String ori = str;


        String rev = "";
        for (int i = 0; i <str.length();i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println(rev);

        if(ori.equals(rev)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");



    }
}

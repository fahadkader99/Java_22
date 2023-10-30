package november_22;

import java.util.Scanner;

public class ReverseEveryWord {
    // reverse each word in a given string

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String  a = sc.nextLine();
        String b = a;

        String [] str = b.split(" ");
        String reversedStr = "";

        for (String s : str){
            String reversedWord = "";

            for (int i = s.length()-1; i>=0; i--){
                reversedWord+=s.charAt(i);

            }
            reversedStr += reversedWord+" ";

        }
        System.out.println(reversedStr);
    }
}

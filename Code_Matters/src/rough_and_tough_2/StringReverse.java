package rough_and_tough_2;

import java.util.Scanner;

public class StringReverse {
    // reverse each char in a string:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String r = "";

        for (int i = str.length()-1; i>=0; i--){
            r = r+str.charAt(i);
        }

        System.out.println(r);


    }
}

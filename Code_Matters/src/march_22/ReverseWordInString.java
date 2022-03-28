package march_22;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordInString {

    // reverse every word in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();

        String [] str = s.split(" ");

        String r = "";

        for (int i = 0; i<str.length;i++){
            r = str[i] +" "+ r;
        }

        System.out.println(r);





    }
}

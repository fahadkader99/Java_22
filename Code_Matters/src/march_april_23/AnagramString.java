package march_april_23;

import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        // check if the string is anagram or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().trim();
        sc.close();

        String b = "";
        for (int i = a.length()-1; i>=0; i--){
            b+=a.charAt(i);
        }

        if (a.equalsIgnoreCase(b)){
            System.out.println("Anagram Str");
        }else {
            System.out.println("Not Anagram");
        }
    }
}

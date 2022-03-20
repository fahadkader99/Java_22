package march_22;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char");
        char c = sc.next().toLowerCase().charAt(0);


        if (c=='a' || c == 'e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }


    }
}

package march_23;

import java.util.Scanner;

public class VowelOrConsonant {
    // check the given char is vowel or consonant
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);
        sc.close();
        boolean vowel = false;

        if (ch=='a' || ch == 'A'){
            vowel = true;
        } else if (ch == 'e' || ch == 'E') {
            vowel = true;
        } else if (ch == 'i' || ch == 'I') {
            vowel = true;
        } else if (ch== 'o' || ch == 'O') {
            vowel = true;
        } else if (ch=='u' || ch == 'U') {
            vowel = true;
        }else {
            vowel = false;
        }

        if (vowel){
            System.out.println("Vowel");
        }else {
            System.out.println("Not Vowel");
        }


    }
}

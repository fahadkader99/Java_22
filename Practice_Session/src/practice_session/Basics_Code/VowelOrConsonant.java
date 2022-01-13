package practice_session.Basics_Code;

import java.util.Scanner;

public class VowelOrConsonant {
    // Find the given char is vowel or consonant!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to find out: ");
        char c = input.next().charAt(0);
        VowelOrConsonant v = new VowelOrConsonant();
        v.findLetter(c);

    }
    public void findLetter(char c){

        if (c == 'A' || c== 'E' || c=='I' || c=='O'|| c=='U'|| c=='a'|| c== 'e'|| c =='i'||c=='o'|| c=='u'){
            System.out.println("Letter is vowel");
        }else {
            System.out.println("Letter is consonant");
        }
    }
}


package pair_Program.Strings;

import java.util.Scanner;

public class String8 {
    //How do you count a number of vowels and consonants in a given string?

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = input.nextLine().toLowerCase();


        int v = 0;
        int c = 0;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i)=='a'||s.charAt(i) == 'e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
            }
        }
        System.out.println("No of vowel: "+ v);

        for (int i = 0; i < s.length(); i++){
            if (!(s.charAt(i)=='a'||s.charAt(i) == 'e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')){
                c++;
            }
        }
        System.out.println("No of Consonant: "+ c);


    }
}

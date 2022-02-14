package c_Bat.string2;

import java.util.Scanner;

public class repeatEnd {
    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        String temp = str.substring(str.length()-num);
        String r = "";

        for (int i = 0; i<num;i++){
            r = r+temp;
        }
        System.out.println(r);
    }
}

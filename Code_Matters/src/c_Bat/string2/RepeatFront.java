package c_Bat.string2;

import java.util.Scanner;

public class RepeatFront {
    /*Given a string and an int n, return a string made of the first n characters of the string,
    followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string,
    inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Enter number for N times: ");
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = n; i>0; i--){
            sb.append(str.substring(0,i));
        }

        System.out.println(sb.toString());

    }
}

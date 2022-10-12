package a_practice;

import java.util.Scanner;

public class ReverseString {

    // reverse a given string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().toLowerCase().trim();
        sc.close();

        one(a);
        two(a);

    }

    static void one(String  a){
        String str = "";

        for (int i=a.length()-1; i>=0; i--){
            str+=a.charAt(i);
        }

        System.out.println("Reversed: " + str);
    }

    static void two(String  a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        System.out.println("Reversed: " + sb.reverse());
    }
}

package a_practice;

import java.util.Locale;
import java.util.Scanner;

public class HalfString {

    // find the first and second half of a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine().trim();
        sc.close();


        HalfString h = new HalfString();
        h.half(str);
    }

    void half(String str){
        System.out.println("First half: -> " + str.substring(0,str.length()/2));
        System.out.println("Second half: -> " + str.substring(str.length()/2));
    }
}

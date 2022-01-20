package codingBat.String1;

import java.util.Scanner;

public class miniCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However,
    if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string: ");
        String a = sc.nextLine();
        System.out.println("Enter B string: ");
        String b = sc.nextLine();

        if (a.length()>b.length()){
            System.out.println(a.substring(0,b.length())+b);
        }
        else if (b.length()>a.length()){
            System.out.println(a+b.substring(0,a.length()));
        }
        else if (a.length()==b.length()){
            System.out.println(a+b);
        }

        minLength(a,b);

    }
    public static void minLength(String a, String b){

        int min = Math.min(a.length(),b.length());

        String s = a.substring(a.length()-min)+b.substring(b.length()-min);
        System.out.println("New Str: "+ s);

    }
}

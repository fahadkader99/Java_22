package talent_LMS;

import java.util.Scanner;

public class Str1 {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();

        System.out.println("Hello "+ str+"!");

    }
}

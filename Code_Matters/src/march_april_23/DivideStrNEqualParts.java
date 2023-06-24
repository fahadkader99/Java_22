package march_april_23;

import java.util.Scanner;

public class DivideStrNEqualParts {
    // divide a string based on N equal parts
    // first divide a string & then write a program to divide based on N index.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim(); //"0123456789";
        System.out.println("Length is = " + a.length());
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nEnter index to divide: ");
        int middle = sc1.nextInt();

        String b = a.substring(0,middle);
        String c = a.substring(middle,a.length());

        System.out.println("\n"+ b +" + " + c);

    }
}

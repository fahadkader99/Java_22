package november_22;

import java.util.Scanner;

public class LastFourChar {
    public static void main(String[] args) {
        // print the last four char
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a String");
        String a = scanner.nextLine().trim().toLowerCase();
        String b = a;
        scanner.close();
        b = b.replaceAll(" ", "");

        if (b.length()>=4){
            System.out.println(b.substring(b.length()-4));
        }else {
            System.out.println("Try Again");
        }
    }
}

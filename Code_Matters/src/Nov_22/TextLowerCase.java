package Nov_22;

import java.util.Scanner;

public class TextLowerCase {
    // covert a given text to lowercase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a capitan line");
        String a = sc.nextLine().toLowerCase().trim();
        sc.close();
        System.out.println(a);
    }
}

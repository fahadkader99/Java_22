package practice2022.january.jan1;

import java.util.Scanner;

public class ASCIIofChar {
    // find ASCII value of a char
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nChar to ASCII : ");
            char c = in.next().charAt(0);

            int value = c;
            System.out.println("The value: " + value);
        }

    }
}

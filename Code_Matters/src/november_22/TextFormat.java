package november_22;

import java.util.Arrays;

public class TextFormat {
    // Print text using format
    public static void main(String[] args) {
        String a = "Fahad    Kader";
        String[] b = a.split("\\s+");
        System.out.println(Arrays.toString(b));

        System.out.println("Statement one.\nThis is a new line.\n\tThis is a new line with one tab.\n\t\tNew line with double tab");
    }
}

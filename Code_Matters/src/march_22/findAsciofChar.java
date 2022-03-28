package march_22;

import java.util.Scanner;

public class findAsciofChar {
    // find the ascii value of a given character

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);

        int value = ch;
        System.out.println("ASCII value is: "+ value);


    }
}

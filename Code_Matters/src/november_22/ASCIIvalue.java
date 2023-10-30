package november_22;

import java.util.Scanner;

public class ASCIIvalue {
    // find the ASCII value of a given cahr
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char ");
        char c = sc.nextLine().charAt(0);
        sc.close();

        System.out.println("ASCII value of " + c +" is: " +(int)c);


    }
}

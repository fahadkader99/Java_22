package may_23;

import java.util.Scanner;

public class StringRev {
    // reverse a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();
        String b = "";
        for (int i = a.length()-1; i>=0; i--){
            b+= a.charAt(i);
        }
        System.out.println(b);
    }
}

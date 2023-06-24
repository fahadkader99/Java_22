package jan_feb_23;

import java.util.Scanner;

public class Palindrome {
    // find out if the sting is palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        sc.close();

        String b = a;

        String c = "";
        for (int i = b.length()-1; i>= 0; i--){
            c+=b.charAt(i);
        }

        if (b.equalsIgnoreCase(c)){
            System.out.println("Palindrome ");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}

package jan_23;

import java.util.Scanner;

public class AnagramString {
    // check if both the string are anagram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter 2 String: ");
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        sc.close();

        boolean flag = false;

        if (a.length()==b.length()){
            flag = true;
        }




    }
}

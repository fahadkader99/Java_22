package march_22;

import java.util.Scanner;

public class PalindromeStringManyWays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        m1(str);

        // 2nd method with SB.
        if (m2(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

        // 3rd method - using character
        if (m3(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
    public static void m1(String str){
        String original = str;
        String r = "";
        for (int i = str.length()-1; i>=0;i--){
            r+= str.charAt(i);
        }
        if (original.equals(r)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }
    public static boolean m2(String str){

        if (str==null){
            return false;
        }

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString().equals(str);

    }

    public static boolean m3(String str){

        int head = 0;
        int tail = str.length()-1;

        while (head < tail){
            if (str.charAt(head) != str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}

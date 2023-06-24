package jan_feb_23;

import java.util.Scanner;

public class Palindrome2 {
    // string read from left to right & right to left should be same

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();

        // Calling method
        Palindrome2 pal = new Palindrome2();
        if (pal.isPalindrome(a)==true){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

    boolean one(String a){
        String b = "";
        boolean flag = true;
        for (int i = a.length()-1; i>=0; i--){
            b+= a.charAt(i);
        }
        if (!a.equalsIgnoreCase(b)){
            flag = false;
        }else {
            flag = true;
        }
        return flag;

    }

     boolean isPalindrome(String a){

        if (a==null){
            return  false;
        }
        if (a.length() <=1){
            return true;
        }

        String first = a.substring(0,1);
        String last = a.substring(a.length()-1, a.length());
        if (!first.equalsIgnoreCase(last)){
            return false;
        }else {
            return isPalindrome(a.substring(1, a.length()-1));
        }




    }


}

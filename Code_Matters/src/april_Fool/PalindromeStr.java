package april_Fool;

import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

       // pal1(str);

        if (pal2(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
    public static void pal1(String str){

        String s = str;
        String p = "";

        for (int i = str.length()-1; i>=0;i--){
            p += str.charAt(i);
        }
        System.out.println(p);

        if (p.equalsIgnoreCase(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }

    public static boolean pal2(String str){        //madam

        int head = 0;
        int tail = str.length()-1;

        while (head<tail){
            if (str.charAt(head) != str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;


    }

}

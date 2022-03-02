package qA_Fox_3;

import java.util.Scanner;

public class PalindromeOrNot {

    // check the num and the string is palindrome or not

    public static void main(String[] args) {
        //palindromeNum();
        palindromeString();


    }
    public static void palindromeNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int ori = num;

        int r = 0;

        while (num>0){
            int remainder = num %10;
             r =r*10+remainder;
            num = num/10;
        }
        System.out.println(r);
        if (ori == r){
            System.out.println("Palindrome Num");
        }else System.out.println("Not palindrome Num");


    }

    public static void palindromeString(){
        // string same when reversed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        String s = str1;

        String t = "";

        for (int i = str1.length()-1; i>=0;i--){
            t = t+str1.charAt(i);
        }
        //System.out.println(t);

        if (s.equals(t)){
            System.out.println("Palindrome string");
        }else System.out.println("Not palindrome");

    }

}

package march_april_23;

import java.util.Scanner;

public class PalindromeCheck {
    //A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
    //Write a method that detects if a string is a palindrome.
    //Tip: Use word.charAt(i) to get the character at position i
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n1 for String Check \n2 for Num Check");
        int choice = sc.nextInt();
        PalindromeCheck palindrome = new PalindromeCheck();

        switch (choice){
            case 1:
                System.out.println("\nEnter a Word: ");
                String str = sc1.nextLine().trim();
                palindrome.strCheck(str);
                break;

            case 2:
                System.out.println("\nEnter a Num: ");
                int num = sc.nextInt();
                palindrome.numCheck(num);
                break;

            default:
                System.out.println("Invalid Query - Try Again");
        }
        sc.close();
        sc1.close();

    }

    void strCheck(String str){
        String a = "";

        for (int i = str.length()-1; i>=0; i--){
            a+= str.charAt(i);
        }

        if (str.equals(a)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    void numCheck(int num){
        int a = num;
        int b = 0;

        while (num > 0){
            int rem = num % 10;
            b = (b * 10) + rem;
            num = num / 10;
        }
        System.out.println(a);
        System.out.println(b);

        if (a == b){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}

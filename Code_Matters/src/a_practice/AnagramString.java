package a_practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    // find out two given string are anagram or not

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String a = sc.nextLine().toLowerCase();
        System.out.println("Enter String 2 ");
        String b = sc.nextLine().toLowerCase();

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean flag = false;
        if (ch1.length== ch2.length){
            for (int i=0; i<ch1.length;i++){
                if (ch1[i]==ch2[i]);
                flag=true;
            }
        }

        if (flag){
            System.out.println("Anagram");
        }else {
            System.out.println("Not anagram");
        }

    }
}

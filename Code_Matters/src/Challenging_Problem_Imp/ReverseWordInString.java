package Challenging_Problem_Imp;

import java.util.Scanner;

public class ReverseWordInString {
    /*In this article, we will reverse the order of words in a given String using Java.

input
This is sample

output
sample is This*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String []str = sc.nextLine().split(" ");
        sc.close();
        String rev = "";

        for (int i = str.length-1; i>=0;i--){
            rev +=str[i]+" ";
        }

        System.out.println(rev);
    }
}

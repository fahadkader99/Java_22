package c_Bat.string2;

import java.util.Scanner;

public class endOther {
    /*
    Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = sc.nextLine().toLowerCase();
        System.out.println("Enter b String:");
        String b = sc.nextLine().toLowerCase();

        //boolean a1 = false;
        int a1 = 0;
        for (int i = 0; i <a.length();i++){
            if (a.endsWith(b)){
                a1++;
            }
        }

        int b1 = 0;
        for (int i =0; i<b.length();i++){
            if (b.endsWith(a)){
                b1++;
            }
        }

        System.out.println(a1);
        System.out.println(b1);

        if (a1==b1){
            System.out.println("true");
        }else System.out.println("False");



    }
}
///////// Not fully working yet!
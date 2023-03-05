package jan_23;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // check if 2 string are anagram

    public static void main(String[] args) {
        /*
        1. check the length of the sting
        2. conver to char & run a for loop & verify they are matching
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String ");
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        sc.close();

        boolean flag = false;

        char[] c = a.toLowerCase().toCharArray();
        char[] d = b.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        if (c.length == d.length){
            for (int i = 0; i < c.length; i++){
                if (c[i] == d[i]){
                    flag = true;
                }
            }
        }else {
           flag = false;
        }

        if (flag){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }

    }
}

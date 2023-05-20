package may_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoStrAnagram {
    // check if 2 given string are anagram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String: ");
        String a = sc.nextLine().toLowerCase().trim();
        String b = sc.nextLine().toLowerCase().trim();
        sc.close();

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);

        boolean flag = false;

        if (a.length()==b.length()){
            for (int i = 0; i<aa.length; i++){
                if (aa[i]!=bb[i]){
                    flag = false;
                }else {
                    flag = true;
                }
            }
        }else {
            flag = false;
        }

        if (flag){
            System.out.println("Both anagram");
        }else {
            System.out.println("Not anagram");
        }





    }
}

package Challenging_Problem_Imp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharInString {
    // find the duplicate char in string; best / fasted algorithm way is to use set 0(n)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        char[]ch = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i<= ch.length-1;i++){
            if (set.add(ch[i])==false){
                System.out.println("Duplicate: "+ ch[i]);
            }
        }




    }
}

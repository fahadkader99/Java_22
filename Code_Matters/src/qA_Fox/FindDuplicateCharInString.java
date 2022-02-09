package qA_Fox;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharInString {
    // using set

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();

//        for (int i = 0; i< ch.length;i++){
//            if (set.add(ch[i])==false){
//                System.out.println("Duplicate "+ ch[i]);
//            }
//        }

        for (Character c : ch){
            if (set.add(c)==false){
                System.out.println(c);
            }
        }

        // both loop works the same way with same output.


    }
}

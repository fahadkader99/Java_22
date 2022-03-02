package qA_Fox_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FIndNumOfCharInStr {
    // find the number of repetitive char in a string:
    // ex: arun motoori - o - 3, r - 2.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        //withLoops(str);
        hashMap(str);
        sc.close();

    }
    public static void withLoops(String str){
        int count = 0;


/*
        for (int i = 0; i<str.length();i++){
            for (int j = i+1; j <str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                    System.out.println("Duplicate: "+ str.charAt(j)+ " times + count);
                }"
            }
        }
*/

            // able to get the duplicate char but count is giving wrong feedback
    }

    public static void hashMap(String  str){       // we need to use map / hashmap to solve the problem

        //str = fahad kader;


        char[] ch = str.toCharArray();

        Map<Character,Integer> map = new HashMap();

        for (Character c :ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        for (Character c :map.keySet()){
            System.out.println("Character: "+ c+" is repeated "+ map.get(c)+" times" );
        }





    }


}

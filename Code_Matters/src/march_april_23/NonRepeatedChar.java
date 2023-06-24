package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatedChar {
    // find out the first non-repeated
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String with repeated chars: ");
        String a = sc.nextLine().trim();
        sc.close();


        usingMap(a);
        usingLoop(a);

    }
    static void usingMap(String a){
        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;
        boolean flag = false;

        for (int i = 0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        // logic for first non-repeated
        for (Character c : map.keySet()){       // b o o k
            if (map.get(c) == 1){
                System.out.println("\nFirst non-repeated char: " + c +" = " +map.get(c));
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Non-repeated char not found. . . ");
        }

    }

    static void usingLoop(String str){

     for (int i = 0; i<str.length(); i++){
         boolean flag = true;
         for (int j = 0; j<str.length();j++){
             if ( i!=j && str.charAt(i) == str.charAt(j) ){
                 flag = false;
                 break;
             }
         }
         if (flag){
             System.out.println("1st non-repeated char: " + str.charAt(i));
             break;
         }else {
             System.out.println("Non-repeated char not found. . . ");
             System.exit(0);
         }
     }




    }


}

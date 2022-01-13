package unique_Team.Sprint_4;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class UN_53 {
    /**
     * Write a method reverse that accepts a Map from integers to strings as a
     * parameter and returns a new Map of strings to integers that is the
     * original's "reverse". The reverse of a map is defined here to be a new map
     * that uses the values from the original as its keys and the keys from the
     * original as its values. Since a map's values need not be unique but its
     * keys must be, it is acceptable to have any of the original keys as the
     * value in the result.
     * <p>
     * Example:
     * Input:  {1=a, 2=b, 3=c, 4=a, 5=d}
     * Output: {a=1, b=2, c=3, d=5}
     */
    public static void main(String[] args) {

//        Scanner inout = new Scanner(System.in);
//        System.out.println("How many Pair you want to include: ");
//        int num = inout.nextInt();
//
//        Map<Integer, String > map = new HashMap<>();
//
//        for (int i =0; i < num; i++ ){
//            System.out.println("Enter Num "+ (i+1));
//            Integer key = inout.nextInt();
//            System.out.println("Enter Value "+(i+1));
//            String value = inout.next();
//            map.put(key,value);
//        }
//
//        System.out.println(reversedMap(map));
//
//    }
//
//    public static Map<String, Integer> reversedMap(Map<Integer, String> map) {
//
//        Map<String, Integer> reverse = new HashMap<>();
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {       // both works
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//
//            reverse.put(value, key);
//        }
//
////        for (Integer key : map.keySet()){
////            String value = map.get(key);
////
////            if(!reverse.containsKey(value)){
////                reverse.put(value,key);
////            }
////        }
//
//        return reverse;
//    }

        Scanner scan = new Scanner(System.in);
        System.out.println("How many key-value pairs do you want to input?");
        try {
            int iterations = scan.nextInt();

            Map<Integer, String> map = new HashMap<>();


            for (int i = 0; i < iterations; i++) {
                System.out.println("Enter key: " + (i + 1));
                Integer key = scan.nextInt();


                System.out.println("Enter value: " + (i + 1));
                String value = scan.next();

                map.put(key, value);
            }

            System.out.println(reverseMethod(map));

        } catch (InputMismatchException e) {
            System.out.println("Try again, wrong input provided!");
        }
    }


    public static Map<String, Integer> reverseMethod(Map<Integer, String> map) {
        Map<String, Integer> reversed = new HashMap<>();

        for (Integer key : map.keySet()) {
            String value = map.get(key);

            if (!reversed.containsKey(value)) {
                reversed.put(value, key);
            }
        }
        return reversed;
    }
}
package aug_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {
    // count the number of words in  a string:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String with words");
        String a = scanner.nextLine().toLowerCase().trim();
        scanner.close();


        String [] str = a.split("\\s+");
        Map<String , Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<str.length; i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], 1);
            }else {
                map.put(str[i], map.get(str[i]) + 1);
            }
        }

        for (String s: map.keySet()){
            System.out.println(s + " = " + map.get(s));
        }

    }
}

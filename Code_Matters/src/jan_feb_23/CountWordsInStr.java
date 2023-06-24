package jan_feb_23;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsInStr {
    // count the number of words in a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String / Line: ");
        String  a = sc.nextLine().trim();
        sc.close();

        String [] str = a.split("\\s+");
        System.out.println(Arrays.toString(str));

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<str.length; i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], 1);
            }else {
                map.put(str[i], map.get(str[i])+1 );
            }
        }

        for (String e : map.keySet()){
            System.out.println(e +" = " + map.get(e));
        }
    }
}

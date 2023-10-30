package november_22;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        // find the first non-repeated char
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String: ");
        String a = scanner.nextLine().toLowerCase().trim();
        scanner.close();

        String b = a.replaceAll(" ", "");
        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i< ch.length;i++){

            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);

            }
        }

        boolean flag = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("1st Non repeated: " + entry.getKey());
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println("No char found");
        }


    }
}

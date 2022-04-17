package april_Fool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharOccurrenceInString {
    // count the character occurrence in a string

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Str");
        String a = sc.nextLine();
        sc.close();

        //findWordOccurrance(a);
        countCharacterOccurrence_OrDuplicateChar(a);

    }
    public static void findWordOccurrance(String s){

        Map<String , Integer> map = new HashMap<>();
        String[] ch = s.split(" ");
        int count = 1;

        for (int i = 0; i< ch.length;i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (String x : map.keySet()){
            System.out.println(x+" = "+ map.get(x));
        }


    }

    public static void countCharacterOccurrence_OrDuplicateChar(String str){

        if (str.length()==0) System.out.println(str);
        if (str.length()==1) System.out.println(str);
        if (str.isEmpty()) System.out.println("String is Empty");

        char[] words = str.toCharArray();
        int count = 1;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< words.length;i++){
            if (!map.containsKey(words[i])){
               map.put(words[i], count);
            }else {
                map.put(words[i], map.get(words[i])+1);
            }
        }

        for (Character c : map.keySet()){
            System.out.println(c+" = "+ map.get(c));
        }


    }
}

package april_Fool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumOfWordsInString_Maps {
    // count the number of words in a string:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();


        findWordOccurrance(s);


    }
    public static void wordCount(String s){
        String[] a = s.split(" ");
        System.out.println("Num of Words: "+ a.length);
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
}

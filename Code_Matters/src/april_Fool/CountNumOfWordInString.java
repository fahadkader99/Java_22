package april_Fool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumOfWordInString {
    // count the numbers of words in the string

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Str");
        String a = sc.nextLine();

        exactWay_Maps(a);



    }
    public static void easyWay(String a){
        String[] b = a.split(" ");
        int length = b.length;
        System.out.println("Number of words in the string: "+ length);
    }

    public static void exactWay_Maps(String a){
        // find the occurrence of each word and print them out separately

        Map<String, Integer> map = new HashMap<>();

        String[] arr = a.split(" ");
        int counter = 1;

        for (int i = 0; i< arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], counter);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        // Print the results
        for (String X : map.keySet()){
            System.out.println(X+" = "+ map.get(X));
        }

    }
    public static void find_Char_Occurrence(String a){
        
    }
}

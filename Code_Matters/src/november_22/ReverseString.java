package november_22;

import java.util.*;

public class ReverseString {
    // reverse a string using collections

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // String , Array, List, Set, Map, foo loop
        System.out.println("Enter a String:  ");
        String  a = sc.nextLine().trim();

        String [] arr = a.split("\\s+");
        List<String > list = Arrays.asList(arr);        // Converting Array to a List
        Collections.reverse(list);

        for (String e : list){
            System.out.print(e +" ");
        }

    }
}

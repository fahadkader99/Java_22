package unique_Team.Sprint_4;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

import java.util.*;

public class UN_54 {
    /**
     * Given an array of strings, return a Map<String, Integer> containing a key for every
     * different string in the array, and the value is that string's length.
     * Example:
     * Input:  {"this", "and", "that", "and"}
     * Output: {"that"= 4, "and"= 3, "this"= 4}
     */

  public Map<String, Integer> keyContainer(List<String >list){
      Map<String , Integer> keyContainer = new HashMap<>();
      for (String str : list){
          keyContainer.put(str,str.length());
      }
      return keyContainer;
  }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       List<String> list = new ArrayList<>();

        System.out.println("Enter number of Strings in the list: ");
        int num = input.nextInt();
        input.nextLine();

        if (num <=0){
            System.out.println("Enter a valid Number: ");
        }else {
            System.out.println("Enter the Strings: ");
        }
        for (int i = 0; i < num; i++){
            String str = input.nextLine();
            list.add(str);
        }
        System.out.println("The output is: "+ new UN_54().keyContainer(list));


    }
}

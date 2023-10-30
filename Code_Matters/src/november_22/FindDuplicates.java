package november_22;

import java.util.*;

public class FindDuplicates {
    // Find Duplicates in a given array

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,4,5,6,7};

        // Can use set or map or sort the array and user for loop to find out

        System.out.println("\n========Brut Force==========");
        // Brut Force
        Arrays.sort(arr);

        for (int i=0; i< arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i] +" ");
            }
        }

        System.out.println("\n========Set==========");

        // using set
        Set<Integer> set = new LinkedHashSet<>();
        for (int i=0; i< arr.length; i++){
            if (set.add(arr[i])==false){
                System.out.println(arr[i]);
            }
        }

        System.out.println("\n========Map==========");

        // using map
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i=0; i< arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1 );
            }
        }

        for (Integer e : map.keySet()){
            if (map.get(e)>1){
                System.out.println(e +" = "+ map.get(e));
            }
        }

    }
}

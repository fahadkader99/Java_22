package november_22;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Array size");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++){
            System.out.println("Enter Element " +(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Set<Integer> set = new LinkedHashSet<>();
        for (int i =0; i <arr.length; i++){
            set.add(arr[i]);
        }
        //System.out.println(set);

        Integer[] arr2 = set.toArray(new Integer[set.size()]);      // adding set to Array directly
        System.out.println(Arrays.toString(arr2));
    }
}

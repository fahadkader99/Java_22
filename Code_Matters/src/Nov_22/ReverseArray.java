package Nov_22;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i <= arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));

        /*
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> l2 = new ArrayList<>();
        for (int i = l1.size()-1; i>=0; i--){
            l2.add(l1.get(i));
        }
        System.out.println(l2);
        */

        // So array can't be Reversed just like list

    }
}

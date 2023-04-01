package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexArray {
    // find the index of an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter Num to find: ");
        int key = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        boolean flag = false;
        int index = 0;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == key){
                flag = true;
                index = i;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        if (flag){
            System.out.println(key +" found at index: " + index);
        }else {
            System.out.println("Key Not Found...! ");
        }

    }
}

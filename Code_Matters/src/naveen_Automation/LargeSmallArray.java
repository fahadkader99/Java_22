package naveen_Automation;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class LargeSmallArray {
    // find the largest and smallest number in array

    @Test
    void findlargeSmall(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i=0; i<arr.length; i++){
//            System.out.println("Enter elements " +(i+1));
//            arr[i] = sc.nextInt();
//        }
//        sc.close();

        int[] arr = {1,2,3,4,5};
        int small = arr[0];
        int large = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>large){
                large = arr[i];
            }
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] < small){
                small = arr[i];
            }
        }

        System.out.println("\nSmall " + small);
        System.out.println("\nLarge " + large);
    }


    @Test
    void findNum(){
        int [] arr = {2,3,7,6,5};
        Arrays.sort(arr);
        int small = arr[0];
        int large = arr[arr.length-1];

        System.out.println("Small " + small);
        System.out.println("Large " + large);
    }

}

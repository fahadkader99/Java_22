package jan_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    // Reverse a array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int a = sc.nextInt();

        int[] arr= new int[a];
        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter Element: " + (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();



        ReverseArray rev = new ReverseArray();
        //
        // rev.one();
        //rev.usingSWAP(arr);
        rev.usingLoop(arr);

    }

    void one(){             // Collections only work with Objects || Wrapper class

        Integer[] myArray = new Integer[] {1,2,3,4,5};
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array: " + Arrays.asList(myArray));
    }

    void usingSWAP(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }

    void usingLoop(int[] arr){

        int length = arr.length-1;
        int halfLength = length/2;

        for (int i = 0; i < halfLength; i++){
            int temp = arr[i];
            arr[i] = arr[length-i];
            arr[length-i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

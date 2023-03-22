package march_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();


        String [] arr = new String[size];

        for (int i = 0; i<arr.length; i++) {
            System.out.println("Enter element: " + (i+1));
            arr[i] = scanner.nextLine().trim();
        }
        System.out.println("Before sort: " + Arrays.toString(arr));
        sortStringAlphabetically(arr);
//        Arrays.sort(arr);
//        System.out.println("After Sort: " + Arrays.toString(arr));

    }
    static void sortStringAlphabetically(String [] arr){
        // sorting the string
        String temp;
        for (int i = 0; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++){

                if (arr[i].compareTo(arr[j]) > 0){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Displaying the Strings after sorting
        System.out.println("\nAfter sort: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +", ");
        }
    }
}

package anotherDay.array1D;

import java.util.Scanner;

public class maxEnd3 {
    /*
    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
        and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i <arr.length;i++){                 // this loop is taking input
            System.out.println("Enter element: "+ (i+1));
            arr[i] = sc.nextInt();
        }







    }
}

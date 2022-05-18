package Challenging_Problem_Imp;

import java.util.Scanner;

public class DeleteElementInArray {
    // deleting element from an array


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Index you want to delete: ");
        int index = s.nextInt();

        int[]a = new int[10];
        a[0] = 5;
        a[1] = 9;
        a[2] = 6;
        a[3] = 10;
        a[4] = 12;
        a[5] = 7;

        int n = 6; // it is the current element numbers in the array

        System.out.println("\nBefore Delete ");
        for (int x:
                a) {
            System.out.print( x +" ");
        }

        // loop from the target to the logical end of the array
        for (int i = index; i <n; i++){
            a[i] = a[i+1];      // copy the next element into theis position
        }
        a[n-1] = 0;             // reset the last element to zero
        n--;                     // decrease the current size of array

        System.out.println("\n\nAfter Delete");
        for (int x:
                a) {
            System.out.print( x +" ");
        }

    }
}

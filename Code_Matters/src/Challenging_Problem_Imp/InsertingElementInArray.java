package Challenging_Problem_Imp;

import java.util.Scanner;

public class InsertingElementInArray {
    // insert element at particular index in an array

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element ");
        int num = s.nextInt();
        System.out.println("Enter the index you want to inset ");
        int index = s.nextInt();



        int[]a = new int[10];
        a[0] = 5;
        a[1] = 9;
        a[2] = 6;
        a[3] = 10;
        a[4] = 12;
        a[5] = 7;

        int n = 6; // it is the current element numbers in the array

        System.out.println("\nBefore Insert ");
        for (int x:
             a) {
            System.out.print( x +" ");
        }

        for (int i = n; i >index; i--){
            a[i] = a[i-1];
        }
        a[index] = num;

        System.out.println("\nAfter Insert");
        for (int x :
             a) {
            System.out.print(x+" ");

        }

    }
}

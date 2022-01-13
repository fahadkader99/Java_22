package practice_session.Array.W3;

import java.util.Arrays;

public class copyArray {
    //Write a Java program to copy an array by iterating the array
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,0};
        int[] b = new int[12];

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        System.out.println("Copy a to b, now b = "+Arrays.toString(b));

    }
}

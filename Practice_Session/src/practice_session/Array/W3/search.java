package practice_session.Array.W3;

import java.util.Arrays;
import java.util.Scanner;

public class search {
    //Write a Java program to test if an array contains a specific value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [] a = {1,2,3,4,5,6,7,8,9,0};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println("\nenter the key to look for:");
        int key = input.nextInt();
        System.out.println("THe key is a index: "+ Arrays.binarySearch(a,key));
//        System.out.println("is the "+ key + " contains in the elements? "+ Arrays.equals(a));
    }
}

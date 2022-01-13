package unique_Team.sprint_5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class UN_85 {
    // Write a program to print the duplicate elements present in the array.
    // Use two loops.If the match is found, print the duplicate element.

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("\nEnter the size of Array # ");
            int size = s.nextInt();
            Integer[]arr = new Integer[size];

            for (int i = 0; i< arr.length; i++){
                System.out.println("Enter element # "+ (i+1));
                arr[i] = s.nextInt();
            }
            findDuplicate(arr);
        }catch (Exception e){
            System.out.println("Try again. Exception found: "+ e);
        }
    }
    public static Integer[] findDuplicate(Integer[] arr){
        try {
            boolean isDuplicate = false;
            for (int i = 0; i < arr.length; i++){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i].equals(arr[j])){
                        System.out.println("Duplicate: "+arr[j]);
                        isDuplicate = true;
                    }
                }
            }
            if (!isDuplicate) {
                System.out.println("No duplicate element found. ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return arr;
    }
}

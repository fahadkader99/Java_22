package unique_Team.sprint_5;

import java.util.Arrays;
import java.util.Scanner;

public class UN85 {
    // Write a program to print the duplicate elements present in the array.
   // Use two loops.If the match is found, print the duplicate element.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the size of Array # ");
        int size = input.nextInt();
        input.nextLine();

        String[] arr1 = new String[size];

        try {
            for (int i = 0; i<size; i++){
                System.out.println("Enter element # ");
                arr1[i] = input.nextLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Integer[] arr2 = new Integer[size];
        try {

            for (int i = 0; i <size; i++){
                arr2[i]=Integer.valueOf(arr1[i]);
            }
        }catch (Exception e){
            System.out.println("Try again with integer value. Exception found: "+ e);
        }

        boolean duplicate = false;
        for (int i = 0; i <arr2.length; i++){
            for (int j = i+1; j<arr2.length; j++){
                if (arr2[i].equals(arr2[j])){
                    System.out.println("Duplicate: "+arr2[j]);
                    duplicate = true;
                }
            }
        }
        if (!duplicate){
            System.out.println("No duplicate found. ");
        }

    }
}

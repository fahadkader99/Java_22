package qA_Fox_3;

import java.util.Scanner;

public class FindTheFirstOccurrenceOfNum {
    // find the first occurrence of the given element in the array without using any algo, so find the index of the given number
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,3,2,5,6,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isFound = false;

        for (int i = 0; i<arr.length;i++){

            if (arr[i]==num){

                System.out.print("1st Occurrence of "+arr[i]+ " is at index: "+ i);
                isFound = true;
                break;
            }
        }
        if (isFound==false){
            System.out.println("No match found ");
        }

    }
}

package algo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray {
    // implement binary search in your way - > condition array has to be ascending sorted and can't have duplicate elements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,5,2,7,11,4,3,1,0,10,12,13,8,17,19};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the Num you are looking for: ");
        int num = sc.nextInt();


        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while (low<=high){
            mid = (low+high)/2;

            if (num==arr[mid]){
                System.out.println("Given num is available at the index: "+ mid);
                break;
            }
            else if (num<mid){

                high = mid-1;
            }
            else if (num>mid){

                low = mid+1;
            }

        }

        if (low>high){
            System.out.println("Given is not available int the Array...!");
        }


    }
}

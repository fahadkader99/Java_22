package march_22.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {9,5,2,7,11,4,3,1,0,10,12,13,8,17,19};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the num looking for: ");
        int searchNum = sc.nextInt();

        int low = arr[0];
        int high = arr.length-1;
        int mid = 0;


        while (low <= high){

            mid = (low+high)/2;

            if (searchNum == arr[mid]){
                System.out.println("Given num is at index: "+ mid);
                break;
            }
            else if (searchNum < mid){
                high = mid-1;
            }
            else if (searchNum > mid){
                low = mid+1;
            }

        }

        if (low > high){
            System.out.println("Given num is NOT in the Array/....!");
        }





    }
}

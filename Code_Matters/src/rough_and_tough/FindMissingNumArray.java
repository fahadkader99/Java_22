package rough_and_tough;

import java.util.Scanner;

public class FindMissingNumArray {
    // find the missing num in an array


    /*
    Precondition must be meet:
    1. Array should not have duplicates
    Array no need to be sorted order (either ascending / descending)
    Values should be in range
     */
    public static void main(String[] args) {

    method2();


    }
    public static void method1(){
        int[] arr = {1,2,3,4,6,7,8,9};

        int sum1 = 0;

        for (int i = 0; i <arr.length;i++){
            sum1 = sum1+arr[i];
        }

        System.out.println("Sum of Element of Sum1: "+ sum1);

        int sum2 = 0;
        for (int i = 1; i<=9;i++){
            sum2 = sum2+i;              // summing all the elements between start of array and the end of array
        }

        System.out.println("Sum of range of elements: "+ sum2);

        System.out.println("Missing num is "+(sum2-sum1));
    }

    public static void method2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter elements "+(i+1));
            arr[i]= sc.nextInt();
        }

        int length = arr.length+1;  // here length is +1 since we are missing 1 num

        int sum = (length*(length+1))/2;

        for (int i = 0; i<arr.length;i++){
            sum = sum-arr[i];
        }

        System.out.println("Missing Num "+sum);




    }

}

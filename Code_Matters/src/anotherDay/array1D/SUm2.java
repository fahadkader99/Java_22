package anotherDay.array1D;

import java.util.Scanner;

public class SUm2 {
    /*
    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
    just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i <arr.length;i++){                 // this loop is taking input
            System.out.println("Enter element: "+ (i+1));
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        if (arr.length>2){
            sum = arr[0]+arr[1];
        }else if (args.length<2){
            sum=0;
        }

        System.out.println("Sum of 1st 2: ");
        System.out.println(sum);





    }
}

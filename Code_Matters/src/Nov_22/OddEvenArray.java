package Nov_22;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenArray {
    // find the odd and even number in a given array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++){
            System.out.println("Enter elements " + (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(arr));

        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 ==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 != 0 ){
                System.out.print(arr[i] +" ");
            }
        }

    }
}

package Nov_22;

import java.util.Scanner;

public class OddEvenArr {

    // find the odd even number in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element " +(i+1));
            arr[i] = sc.nextInt();


        }

        System.out.println("\nEven:");
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 ==0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("\nODD: ");
        for (Integer e : arr){
            if (e % 2 != 0){
                System.out.println(e);
            }
        }
    }
}

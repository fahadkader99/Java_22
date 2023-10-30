package november_22;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    // search for the given element in the array

    public static void main(String[] args) {
        System.out.println("Enter the Num to find");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[]{1,9,8,7,6,5,4,3,69,80};
        boolean flag = false;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == a){
                System.out.println("\nFound at index " + i);
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        sc.close();
        if (flag){
            System.out.println("Congrates...!");
        }else {
            System.out.println("\nNot found !");
        }
    }
}

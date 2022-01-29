package rough_and_tough;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInArray {
    // search element in the array - using linear / sequential search approach
    public static void main(String[] args) {

        int[]arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to search: ");
        int target = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i <arr.length;i++){
            if (arr[i]==target){
                flag=true;
            }
        }

        if (flag==true){
            System.out.println("Target match found");
        }else System.out.println("Target not found.!!");





    }
}

package June;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingElementInArray {
    // search an element in the array by taking input from the user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find in the array");
        int a = sc.nextInt();
        sc.close();

        int[] num = {1,2,3,4,5,6,7,8,11,9,0,10};
        Arrays.sort(num);

        int b = 0;
        boolean found = false;

        for (int i=0; i<num.length; i++){
            if (num[i] == a){
                b = num[i];
                found = true;
            }
        }

        if (found){
            System.out.println("Element found at index: " + b);
        }else {
            System.out.println("Not found");
        }


    }
}

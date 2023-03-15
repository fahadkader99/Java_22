package march_23;

import java.util.Scanner;

public class RemoveElementsArr {
    // find an element from array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter Element to Remove: ");
        int key = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();

        /**
         * when Remove element from array - size should decrease & other element should move to lower index & return a new array
         */
    }
}
